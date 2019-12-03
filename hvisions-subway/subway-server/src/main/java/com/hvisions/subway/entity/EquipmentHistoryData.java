package com.hvisions.subway.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * 设备历史数据
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class EquipmentHistoryData extends BaseEntity {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 参数所有者
     */
    private Long paramOwner;
    /**
     * 参数名
     */
    private String paramName;
    /**
     * 参数Id
     */
    private Long paramId;
    /**
     * 参数值
     */
    private String paramValue;
    /**
     * 参数显示值
     */
    private String displayValue;
    /**
     * 存储时间
     */
    private Date storageTime;
    /**
     * 状态
     */
    private String status;

}
