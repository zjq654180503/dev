package com.hvisions.subway.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 应急方案
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class CrashSolution extends BaseEntity {
    /**
     * Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 方案编号
     */
    private String code;
    /**
     * 事件级别
     */
    private String eventLevel;
    /**
     * 事件类型
     */
    private String eventType;
    /**
     * 事件名称
     */
    private String eventName;
    /**
     * 事件描述
     */
    private String eventDescription;
    /**
     * 解决方案名称
     */
    private String solutionName;
    /**
     * 解决方案内容
     */
    private String solutionContent;
    /**
     * 解决方案描述
     */
    private String solutionDescription;
    /**
     * 文档名称
     */
    private String documentName;
    /**
     * 文档地址
     */
    private String documentUrl;
}
