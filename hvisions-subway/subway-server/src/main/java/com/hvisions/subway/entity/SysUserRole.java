package com.hvisions.subway.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * 系统角色用户关联
 */
@Entity
@Data
public class SysUserRole extends BaseEntity{
    /**
     * 用户角色关联id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userRoleId;
    /**
     * 关联用户id
     */
    private Long userId;
    /**
     * 关联角色id
     */
    private Long roleId;
}
