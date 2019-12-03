package com.hvisions.subway.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 告警点
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class AlarmPoint extends BaseEntity {
    /**
     * Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 父级
     */
    private Long parentId;
    /**
     * 所属模型对象id
     */
    private Long modelObjectId;
    /**
     * 编码
     */
    private String code;
    /**
     * 报警点名称
     */
    private String alarmPointName;
    /**
     * 状态
     */
    private String status;
}
