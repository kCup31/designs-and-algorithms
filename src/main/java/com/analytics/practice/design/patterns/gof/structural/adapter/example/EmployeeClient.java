package com.analytics.practice.design.patterns.gof.structural.adapter.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {

        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDb = new EmployeeDb("1234", "Diana", "hayden", "diana@vcc.com");

        employees.add(employeeFromDb);


        EmployeeLdap employeeLdap = new EmployeeLdap("Chiee", "Chona", "Hassan", "chona@hasan.com");

        employees.add(new EmployeeAdapterLdap(employeeLdap));

        return employees;

    }
}
