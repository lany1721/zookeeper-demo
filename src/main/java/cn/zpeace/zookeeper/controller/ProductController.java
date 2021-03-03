package cn.zpeace.zookeeper.controller;

import cn.zpeace.zookeeper.service.ProductService;
import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zpeace
 * @date 2020/12/22
 */
@RestController
public class ProductController {


    private final ProductService productService;

    private final String ZOOKEEPER_CONNECTION_STRING = "192.168.75.133:2181,192.168.75.136:2181,192.168.75.135:2181";

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public String reduceStock(@PathVariable Integer id){
        // zookeeper 重试策略
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 3);
        // 创建客户端
        CuratorFramework client = CuratorFrameworkFactory.newClient(ZOOKEEPER_CONNECTION_STRING, retryPolicy);
        client.start();
        // 创建资源互斥锁
        InterProcessMutex lock = new InterProcessMutex(client, "/product_" + id);
        try {
            //加锁
            lock.acquire();
            productService.reduceStock(id);
        } catch (Exception e) {
            return e.getMessage();
        } finally {
            // 释放锁
            try {
                lock.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "ok";
    }
}
