package com.hvisions.subway.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * 短信任务
 */
@Entity
@Data
public class SmsTask extends BaseEntity {
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
     * 短信标题
     */
    private String title;
    /**
     * 短信内容
     */
    private String content;
    /**
     * 短信类型
     */
    private String smsType;
    /**
     * 邮件重要性级别
     */
    private String smsLevel;
    /**
     * 发送完成时间
     */
    private Date completionTime;
    /**
     * 状态
     */
    private String status;
}
