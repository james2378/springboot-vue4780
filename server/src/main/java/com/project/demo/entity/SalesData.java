package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 销售数据：(SalesData)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "SalesData")
public class SalesData implements Serializable {

    // SalesData编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sales_data_id")
    private Integer sales_data_id;

    // 报表月份
    @Basic
    private String reporting_month;
    // 商品名称
    @Basic
    private String trade_name;
    // 销售数量
    @Basic
    private String sales_volumes;
    // 备注信息
    @Basic
    private String remarks;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
