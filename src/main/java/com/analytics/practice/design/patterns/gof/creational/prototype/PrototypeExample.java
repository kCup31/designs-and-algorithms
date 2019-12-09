package com.analytics.practice.design.patterns.gof.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeExample {

    public static void main(String[] args) {

        String sql = "select * from movies";
        List<String> parameters = new ArrayList<>();
        parameters.add("Star wars");
        Record record = new Record();
        Statement firstStatement = new Statement(sql, parameters, record);
        System.out.println(firstStatement.getSql());
        System.out.println(firstStatement.getParameters());
        System.out.println(firstStatement.getRecord());
        System.out.println(firstStatement);

        System.out.println("\n");

        Statement secondStatement = firstStatement.clone();
        System.out.println(secondStatement.getSql());
        System.out.println(secondStatement.getParameters());
        System.out.println(secondStatement.getRecord());
        System.out.println(secondStatement);

    }
}

class Statement implements Cloneable {
    private String sql;
    private List<String> parameters;
    private Record record;

    public Statement(String sql, List<String> parameters, Record record) {
        this.sql = sql;
        this.parameters = parameters;
        this.record = record;
    }

    public Statement clone() {
        try {
            return (Statement) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getSql() {
        return sql;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public Record getRecord() {
        return record;
    }
}

class Record {
}

