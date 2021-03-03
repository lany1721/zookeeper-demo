package cn.zpeace.zookeeper.domain.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * (Product)实体类
 *
 * @author zpeace
 * @date 2020-12-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ToString(callSuper = true)
@TableName("product")
public class ProductEntity {

    @TableId(type = IdType.AUTO)
    private Integer id;


    private String productName;


    private Integer stock;


    private Integer version;


}