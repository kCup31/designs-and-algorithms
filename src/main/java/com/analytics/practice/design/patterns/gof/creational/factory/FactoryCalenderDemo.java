package com.analytics.practice.design.patterns.gof.creational.factory;

import java.util.Calendar;
import java.util.Set;

public class FactoryCalenderDemo {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Set<String> typesOfCal = Calendar.getAvailableCalendarTypes();
        System.out.println(cal);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(typesOfCal);
    }
}
