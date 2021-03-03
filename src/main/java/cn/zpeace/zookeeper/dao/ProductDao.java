package cn.zpeace.zookeeper.dao;

import cn.zpeace.zookeeper.domain.entity.ProductEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * (Product)表数据库访问层
 *
 * @author zpeace
 * @date 2020-12-22
 */
@Mapper
public interface ProductDao extends BaseMapper<ProductEntity> {

    /**
     * 减少库存
     * @param id 商品id
     * @return
     */
    Integer reduceStock(@Param("id") Integer id);
}