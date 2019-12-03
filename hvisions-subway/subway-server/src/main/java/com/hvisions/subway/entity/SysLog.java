package com.hvisions.subway.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * 系统日志
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class SysLog extends BaseEntity {
    /**
     * 日志Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 日志类型
     */
    private String type;
    /**
     * 资源id
     */
    private Long resourceId;
    /**
     * 操作编码
     */
    private String operateCode;
    /**
     * 操作人id
     */
    private String operateUserId;
    /**
     * 操作时间
     */
    private Date operateDateTime;
    /**
     * 操作类型
     */
    private String operateType;
    /**
     * 描述
     */
    private String description;
}
