package cn.zpeace.zookeeper.domain.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * (Order)实体类
 *
 * @author zpeace
 * @date 2020-12-22
 */
@Data
@Accessors(chain = true)
@TableName("`order`")
public class OrderEntity{

    @TableId(type = IdType.AUTO)
    private Integer id;


    private Integer productId;


    private Integer userId;


}