// Copyright (c) 2019 Cityline Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION 2.0.19
// ============================================================================
// CHANGE LOG
// 2.0.19 : 2019-12-30, derrick, creation
// ============================================================================
package com.example.demo.strategy;

import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.Configurable;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;

import java.io.Serializable;
import java.util.Properties;
import java.util.UUID;

/**
 * @author derrick
 */
public class CustomGenerationId implements Configurable, IdentifierGenerator {
    private String idPrefix;

    @Override
    public void configure(final Type type, final Properties properties, final ServiceRegistry serviceRegistry) throws MappingException {
        this.idPrefix = properties.getProperty("idPrefix");
    }

    @Override
    public Serializable generate(final SharedSessionContractImplementor sharedSessionContractImplementor, final Object o)
            throws HibernateException {
        return getId();
    }

    private String getId() {
        return UUID.randomUUID().toString().replace("-", "");
//        return idPrefix + "-" + uuid;
    }

}
