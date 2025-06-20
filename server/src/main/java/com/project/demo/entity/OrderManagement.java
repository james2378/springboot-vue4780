package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 订单管理：(OrderManagement)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "OrderManagement")
public class OrderManagement implements Serializable {

    // OrderManagement编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_management_id")
    private Integer order_management_id;

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
    // 商品单价
    @Basic
    private String item_pricing;
    // 购买用户
    @Basic
    private Integer purchase_user;
    // 用户姓名
    @Basic
    private String user_name;
    // 购买数量
    @Basic
    private String purchase_quantity;
    // 合计总价
    @Basic
    private String total_price;
    // 收货地址
    @Basic
    private String shipping_address;
    // 联系方式
    @Basic
    private String contact_information;
    // 备注信息
    @Basic
    private String remarks;
    // 订单状态
    @Basic
    private String order_status;




    // 支付状态
    @Basic
    private String pay_state;

    // 支付类型: 微信、支付宝、网银
    @Basic
    private String pay_type;










    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
