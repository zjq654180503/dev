package com.hvisions.subway.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * 邮件任务
 */
@Entity
@Data
public class MailTask extends BaseEntity {
    /**
     * Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;
    /**
     * 发送人
     */
    private String sendFrom;
    /**
     * 收件人
     */
    private String sendTo;
    /**
     * 抄送人
     */
    private String sendCc;
    /**
     * 邮件主题
     */
    private String subject;
    /**
     * 邮件内容
     */
    private String content;
    /**
     * 邮件模板
     */
    private String templateName;
    /**
     * 邮件模板内容参数
     */
    private String param;
    /**
     * 附件路径
     */
    private String filePath;
    /**
     * 邮件类型
     */
    private String mailType;
    /**
     * 邮件重要性级别
     */
    private String mailLevel;
    /**
     * 发送完成时间
     */
    private Date completionTime;
    /**
     * 状态
     */
    private String status;
}
