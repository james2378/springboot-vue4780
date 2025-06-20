package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 商品中心：(CommodityCenter)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "CommodityCenter")
public class CommodityCenter implements Serializable {

    // CommodityCenter编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commodity_center_id")
    private Integer commodity_center_id;

    // 店铺名称
    @Basic
    private String store_name;
    // 卖家用户
    @Basic
    private Integer seller_customers;
    // 商品编号
    @Basic
    private String item_number;
    // 商品名称
    @Basic
    private String trade_name;
    // 商品类型
    @Basic
    private String product_type;
    // 商品规格
    @Basic
    private String product_specifications;
    // 商品封面
    @Basic
    private String product_cover;
    // 商品库存
    @Basic
    private Integer commodity_inventory;
    // 商品单价
    @Basic
    private String item_pricing;
    // 商品详情
    @Basic
    private String product_details;

    // 点击数
    @Basic
    private Integer hits;

    // 点赞数
    @Basic
    private Integer praise_len;












    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
