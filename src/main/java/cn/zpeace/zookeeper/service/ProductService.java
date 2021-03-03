package cn.zpeace.zookeeper.service;

import cn.zpeace.zookeeper.dao.ProductDao;
import cn.zpeace.zookeeper.domain.entity.OrderEntity;
import cn.zpeace.zookeeper.domain.entity.ProductEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zpeace
 * @date 2020/12/22
 */
@Service
public class ProductService {


    private final ProductDao productDao;

    private final OrderService orderService;

    public ProductService(ProductDao productDao, OrderService orderService) {
        this.productDao = productDao;
        this.orderService = orderService;
    }

    @Transactional(rollbackFor = Throwable.class)
    public void reduceStock(Integer id) throws Exception {
        ProductEntity productEntity = productDao.selectById(id);
        if (productEntity == null || productEntity.getStock() <= 0) {
            throw new RuntimeException("已抢光");
        }
        Integer result = productDao.reduceStock(id);
        if (result == 1) {
            OrderEntity orderEntity = new OrderEntity();
            orderEntity.setProductId(id);
            orderEntity.setUserId(1);
            orderService.save(orderEntity);
        }else {
            throw new RuntimeException("已抢光");
        }
    }
}
