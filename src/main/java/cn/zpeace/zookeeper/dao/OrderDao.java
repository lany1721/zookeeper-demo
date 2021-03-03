package cn.zpeace.zookeeper.dao;

import cn.zpeace.zookeeper.domain.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Order)表数据库访问层
 *
 * @author zpeace
 * @date 2020-12-22
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {

}