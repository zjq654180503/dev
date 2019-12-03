package com.hvisions.subway.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 组织架构
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class SysOrganization extends BaseEntity {
    /**
     * Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 父id
     */
    private Long parentId;
    /**
     * 数据编码
     */
    private String orgCode;
    /**
     * 数据名称、值
     */
    private String orgName;
    /**
     * 状态
     */
    private String status;
}
