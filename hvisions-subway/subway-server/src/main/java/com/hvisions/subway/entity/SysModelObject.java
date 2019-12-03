package com.hvisions.subway.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

/**
 * 模型对象
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class SysModelObject extends BaseEntity {
    /**
     * 模型对象Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long objectId;
    /**
     * 模型对象编码
     */
    private String objectCode;
    /**
     * 模型对象名称
     */
    private String objectName;
    /**
     * 模型类型@JsonIgnoreProperties("cars")
     */
    @ManyToOne
    @JoinColumn(name = "modelTypeId", referencedColumnName = "typeId")//@JsonIgnoreProperties("objectList")该注解可防止json转换进入死循环
    private SysModelType modelType;
    /**
     * 模型对象描述
     */
    private String description;
    /**
     * 模型对象状态
     */
    private String status;

    @ManyToMany
    @JoinTable(name="SysModeStructure", joinColumns={@JoinColumn(name="objectId")},inverseJoinColumns={@JoinColumn(name="parentId")})
    private List<SysModelObject> sysModelObject;
}
