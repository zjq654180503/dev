package com.hvisions.subway.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 告警策略
 */
@Entity
@Data
public class AlarmStrategy extends BaseEntity {
    /**
     * Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 策略编码
     */
    private String code;
    /**
     * 策略设置对象
     */
    private String settingObject;
    /**
     * 设置对象属性
     */
    private String settingProperty;
    /**
     * 比较方式字符：大于：>,小于：<,等于：=
     */
    private String commpareWayStr;
    /**
     * 设置对象属性值
     */
    private String settingValue;
    /**
     * 处理方式
     */
    private String dispose;
    /**
     * 状态
     */
    private String status;
}
