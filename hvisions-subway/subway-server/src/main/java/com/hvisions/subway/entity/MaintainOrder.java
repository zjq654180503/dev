package com.hvisions.subway.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 维修工单
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class MaintainOrder extends BaseEntity {
    /**
     * Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 工单编号
     */
    private String orderNumber;
    /**
     * 工单标题
     */
    private String title;
    /**
     * 工单内容
     */
    private String content;
    /**
     * 所属站点名称
     */
    private String stationName;
    /**
     * 工单负责人
     */
    private Long orderUserId;
    /**
     * 关联报警单id
     */
    private Long alarmInfoId;
    /**
     * 状态
     */
    private String status;
}
