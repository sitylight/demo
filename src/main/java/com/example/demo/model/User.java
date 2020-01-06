// Copyright (c) 2019 Cityline Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION 2.0.19
// ============================================================================
// CHANGE LOG
// 2.0.19 : 2019-12-30, derrick, creation
// ============================================================================
package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * @author derrick
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
//@GenericGenerator(
//        name = "customGenerationId",
//        strategy = "com.example.demo.strategy.CustomGenerationId",
//        parameters = {@Parameter(name = "idPrefix", value = "user")})
public class User extends BaseEntity {

/*    @Id
    @Column(length = 32)
    //    @GenericGenerator(name = "jpa-uuid", strategy = "uuid")
    @GeneratedValue(generator = "customGenerationId")
    //    @GeneratedValue(generator = "jpa-uuid")
    private String id;*/

    @Column
    private String name;

    @Column
    private String password;

    @OneToMany
    @JsonIgnore
    @JoinTable(joinColumns = {@JoinColumn(name = "user_id")}, inverseJoinColumns = {@JoinColumn(name = "role_id")})
    List<Role> roles = new ArrayList<>();

}
