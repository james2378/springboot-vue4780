package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 商品分类：(CommodityClassification)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "CommodityClassification")
public class CommodityClassification implements Serializable {

    // CommodityClassification编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commodity_classification_id")
    private Integer commodity_classification_id;

    // 商品类型
    @Basic
    private String product_type;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
