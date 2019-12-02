package com.hvisions.subway.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * 系统资源
 */
@Entity
@Data
public class SysResource extends BaseEntity{
    /**
     * 资源id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resourceId;
    /**
     * 父级id
     */
    private Long parentId;
    /**
     * 资源编码
     */
    private String resourceCode;
    /**
     * 资源名称
     */
    private String resourceName;
    /**
     * 资源链接
     */
    private String href;
    /**
     * 资源类型
     */
    private Integer resourceType;
    /**
     * 排序序号
     */
    private Integer sort;
    /**
     * 状态
     */
    private String status;

    @ManyToMany
    @JoinTable(name="SysRoleResource", joinColumns={@JoinColumn(name="resourceId")},inverseJoinColumns={@JoinColumn(name="roleId")})
    private List<SysRole> roleList;
}
