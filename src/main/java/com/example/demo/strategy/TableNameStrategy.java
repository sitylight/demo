// Copyright (c) 2019 Cityline Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION 2.0.19
// ============================================================================
// CHANGE LOG
// 2.0.19 : 2019-12-30, derrick, creation
// ============================================================================
package com.example.demo.strategy;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;
import org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy;

/**
 * @author derrick
 */
public class TableNameStrategy extends SpringPhysicalNamingStrategy {
    @Override
    public Identifier toPhysicalTableName(Identifier name, JdbcEnvironment jdbcEnvironment) {
        String tableName = name.getText();
        return super.toPhysicalTableName(Identifier.toIdentifier("d_".concat(tableName)), jdbcEnvironment);
    }
}
