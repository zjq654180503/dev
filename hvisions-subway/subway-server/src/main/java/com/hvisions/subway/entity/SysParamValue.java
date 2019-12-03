package com.hvisions.subway.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 参数值
 */
@Entity
@Data
public class SysParamValue extends BaseEntity {
    /**
     * 参数值Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long valueId;
    /**
     * 参数Id
     */
    private Long paramId;
    /**
     * 参数编码
     */
    private String paramCode;
    /**
     * 参数值
     */
    private String paramValue;
    /**
     * 参数显示值
     */
    private String displayValue;
    /**
     * 状态
     */
    private String status;
}
