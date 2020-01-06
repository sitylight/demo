// Copyright (c) 2020 Cityline Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION 2.0.19
// ============================================================================
// CHANGE LOG
// 2.0.19 : 2020-01-06, derrick, creation
// ============================================================================
package com.example.demo.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

/**
 * @author derrick
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
//@GenericGenerator(name = "customGenerationId", strategy = "com.example.demo.strategy.CustomGenerationId")
public class Role extends BaseEntity{
//    @Id
//    @GeneratedValue(generator = "customGenerationId")
//    @Column(length = 32)
//    private String id;

    private String name;
}
