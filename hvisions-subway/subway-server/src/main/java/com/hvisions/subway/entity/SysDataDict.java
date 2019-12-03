package com.hvisions.subway.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 数据字典
 */
@Entity
@Data
public class SysDataDict extends BaseEntity {
    /**
     * Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 父id
     */
    private Long parentId;
    /**
     * 数据类别
     */
    private String dataType;
    /**
     * 数据编码
     */
    private String dataCode;
    /**
     * 数据名称、值
     */
    private String dataValue;
    /**
     * 顺序
     */
    private Integer sort;
    /**
     * 状态
     */
    private String status;
    /**
     * 描述
     */
    private String description;
}
