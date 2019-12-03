package com.hvisions.subway.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * 告警信息
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class AlarmInfo extends BaseEntity {
    /**
     * Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 告警编码
     */
    private String alarmCode;
    /**
     * 告警名称
     */
    private String alarmName;
    /**
     * 故障等级
     */
    private String alarmLevel;
    /**
     * 告警类型
     */
    private String alarmType;
    /**
     * 告警点Id
     */
    private Long alarmPointId;
    /**
     * 告警时间
     */
    private Date alarmTime;
    /**
     * 子系统名称
     */
    private String subSystemName;
    /**
     * 站点名称
     */
    private String stationName;
    /**
     * 设备名称
     */
    private String equipmentName;
    /**
     * 子架
     */
    private String subRack;
    /**
     * 槽卡
     */
    private String CardSlot;
    /**
     * 故障端口
     */
    private Integer faultPort;
    /**
     * 修复开始时间
     */
    private Date repairStartTime;
    /**
     * 修复完成时间
     */
    private Date repairEndTime;
    /**
     * 故障恢复类型
     */
    private String repairType;
    /**
     * 故障原因
     */
    private String faultCause;
    /**
     * 解决方法
     */
    private String solution;
    /**
     * 备注
     */
    private String remark;
    /**
     * 状态
     */
    private String status;
}
