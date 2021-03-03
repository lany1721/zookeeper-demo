package cn.zpeace.zookeeper.service;

import cn.zpeace.zookeeper.dao.OrderDao;
import cn.zpeace.zookeeper.domain.entity.OrderEntity;
import org.springframework.stereotype.Service;

/**
 * @author zpeace
 * @date 2020/12/22
 */
@Service
public class OrderService {

    private final OrderDao orderDao;

    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    Integer save(OrderEntity orderEntity) {
        return orderDao.insert(orderEntity);
    }
}
