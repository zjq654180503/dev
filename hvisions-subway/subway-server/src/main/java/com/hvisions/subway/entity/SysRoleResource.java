package com.hvisions.subway.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

/**
 * 角色资源关联
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class SysRoleResource extends BaseEntity{
    /**
     * 角色资源关系id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleResourceId;
    /**
     * 关联角色id
     */
    private Long roleId;
    /**
     * 关联资源id
     */
    private Long resourceId;

}
