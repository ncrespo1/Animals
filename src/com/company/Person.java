package com.company;

/**
 * @author Nicolas Crespo
 * @version 2017.3.3
 */

public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    /**
     * @return returns the name of Person
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name sets name of Person
     */
    public void setName(String name) {
        this.name = name;
    }


}