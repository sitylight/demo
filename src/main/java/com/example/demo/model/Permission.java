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

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * @author derrick
 */
@Data
@Entity
@EqualsAndHashCode(callSuper = true)
//@GenericGenerator(name = "customGenerationId", strategy = "com.example.demo.strategy.CustomGenerationId")
public class Permission extends BaseEntity{
//    @Id
//    @GeneratedValue(generator = "customGenerationId")
//    @Column(length = 32)
//    private String id;

    private String code;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(joinColumns = {@JoinColumn(name = "permission_id")}, inverseJoinColumns = {@JoinColumn(name = "role_id")})
    List<Role> roles = new ArrayList<>();
}
