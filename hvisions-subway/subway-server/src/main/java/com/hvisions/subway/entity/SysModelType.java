package com.hvisions.subway.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * 模型类型
 */
@Entity
@Data
public class SysModelType extends BaseEntity {
    /**
     * 模型类型Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long typeId;
    /**
     * 类型编码
     */
    private String typeCode;
    /**
     * 类型名称
     */
    private String typeName;
    /**
     * 类型描述
     */
    private String description;
    /**
     * 状态
     */
    private String status;
    /**
     * 模型对象集合 //@OrderBy("objectId asc")可排序处理 //@JsonIgnoreProperties("modeType")该注解可防止json转换进入死循环
     */
    @OneToMany(mappedBy = "modelType")
    private List<SysModelObject> objectList;
}
