// Copyright (c) 2019 Cityline Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION 2.0.19
// ============================================================================
// CHANGE LOG
// 2.0.19 : 2019-12-30, derrick, creation
// ============================================================================
package com.example.demo.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author derrick
 */
@Data
@Entity
//@GenericGenerator(
//        name = "customGenerationId",
//        strategy = "com.example.demo.strategy.CustomGenerationId",
//        parameters = {@Parameter(name = "idPrefix", value = "user")})
public class User implements Serializable {

    @Id
    @Column(length = 32)
    @GenericGenerator(name = "jpa-uuid", strategy = "uuid")
    //    @GeneratedValue(generator = "customGenerationId")
    @GeneratedValue(generator = "jpa-uuid")
    private String id;

    @Column
    private String name;

    @Column
    private String password;
}
