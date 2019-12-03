package com.hvisions.subway.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 参数定义
 */
@Entity
@Data
public class SysParamDef extends BaseEntity {
    /**
     * 参数Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paramId;
    /**
     * 参数所有者
     */
    private Long paramOwner;
    /**
     * 参数编码
     */
    private String paramCode;
    /**
     * 参数类型
     */
    private String paramType;
    /**
     * 参数内部名称
     */
    private String paramName;
    /**
     * 参数显示名称
     */
    private String displayName;
    /**
     * 状态
     */
    private String status;
}
