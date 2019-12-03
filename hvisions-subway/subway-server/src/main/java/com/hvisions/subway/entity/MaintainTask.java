package com.hvisions.subway.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * 维修任务
 */
@Entity
@Data
public class MaintainTask extends BaseEntity {
    /**
     * Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 任务编号
     */
    private String taskNumber;
    /**
     * 任务标题
     */
    private String title;
    /**
     * 任务内容
     */
    private String content;
    /**
     * 关联工单id
     */
    private Long orderId;
    /**
     * 所属站点名称
     */
    private String stationName;
    /**
     * 任务负责人
     */
    private Long taskUserId;
    /**
     * 处理方法
     */
    private String disposeWay;
    /**
     *处理描述
     */
    private String disposeDescription;
    /**
     * 完成时间
     */
    private Date completionTime;
    /**
     * 状态
     */
    private String status;
}
