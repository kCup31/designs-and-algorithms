package com.analytics.practice.design.patterns.comparators;

import java.util.function.Function;

import static com.analytics.practice.design.patterns.comparators.Comparator.comparing;

/**
 * Factor Method of comparator
 */
public class PlayWithComparators {

    public static void main(String[] args) {

        Person mary = new Person("Mary", 28);
        Person john = new Person("John", 27);
        Person linda = new Person("Linda", 26);
        Person james = new Person("James", 32);
        Person jamesBiss = new Person("James", 23);


        Function<Person, String> getName = p -> p.getName();
        Function<Person, Integer> getAge = p -> p.getAge();

        Comparator<Person> cmpName = comparing(getName);
        Comparator<Person> cmpAge = comparing(getAge);
        Comparator<Person> cmpNameReverse = cmpName.reverse();

        Comparator<Person> cmp  = Comparator.comparing(Person::getName).thenComparing(Person::getAge);

        Comparator<Person> cmpold = cmpName.thenComparing(cmpAge);

        System.out.println("Mary > John : " + (cmp.compare(mary, john) > 0));
        System.out.println("John < Linda : " + (cmp.compare(john, linda) > 0));
        System.out.println("Linda < james : " + (cmp.compare(linda, james) > 0));
        System.out.println("James > James Biss : " + (cmp.compare(james, jamesBiss) > 0));

    }
}
