package com.hvisions.subway.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

/**
 * 备件信息
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class SparePart extends BaseEntity {
    /**
     * 模型对象Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long partId;
    /**
     * 备件名称
     */
    private String partName;
    /**
     * 备件编码
     */
    private String partCode;
    /**
     * 备用关联对象id
     */
    private Long relevanceId;
    /**
     * 备件数量
     */
    private Double quantity;
    /**
     * 单位
     */
    private String unit;
    /**
     * 备件描述
     */
    private String description;
    /**
     * 备件状态
     */
    private String status;

}
