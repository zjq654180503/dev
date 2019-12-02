package com.hvisions.subway.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * 模型结构
 */
@Entity
@Data
public class SysModeStructure extends BaseEntity {
    /**
     * 模型结构Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long structureId;
    /**
     * 模型父级对象id
     */
    private Long parentId;
    /**
     * 模型对象id
     */
    private Long objectId;

}
