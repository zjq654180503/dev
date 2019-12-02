package com.hvisions.subway.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * 系统角色
 */
@Entity
@Data
public class SysRole extends BaseEntity{
    /**
     * 角色id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;
    /**
     * 角色编码
     */
    private String roleCode;
    /**
     * 角色名
     */
    private String roleName;
    /**
     * 角色描述
     */
    private String description;
    /**
     * 状态
     */
    private String status;

    //角色 -- 资源关系：多对多关系;
    @ManyToMany(fetch= FetchType.EAGER)
    @JoinTable(name="SysRoleResource", joinColumns={@JoinColumn(name="roleId")},inverseJoinColumns={@JoinColumn(name="resourceId")})
    private List<SysResource> resourceList;

    // 用户 - 角色关系定义;
    @ManyToMany
    @JoinTable(name="SysUserRole", joinColumns={@JoinColumn(name="roleId")},inverseJoinColumns={@JoinColumn(name="userId")})
    private List<SysUser> userList;

}
