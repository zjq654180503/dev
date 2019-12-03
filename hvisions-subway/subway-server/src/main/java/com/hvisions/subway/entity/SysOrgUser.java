package com.hvisions.subway.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 组织机构用户
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class SysOrgUser extends BaseEntity {
    /**
     * 关联Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 组织机构id
     */
    private Long orgId;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 状态
     */
    private String status;
}
