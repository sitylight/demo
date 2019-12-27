// Copyright (c) 2019 Cityline Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION 2.0.19
// ============================================================================
// CHANGE LOG
// 2.0.19 : 2019-12-27, derrick, creation
// ============================================================================
package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author derrick
 */
public class Test {
    public static void main(String[] args) {
        List<String> values = new ArrayList<>();
        values.add("111");
        values.add("222");
        values.add("2112");
        values.add("333");
        List<String> newValues = values.stream().filter(value -> !value.contains("2")).collect(Collectors.toList());
        System.out.println(newValues.toString());
    }
}
