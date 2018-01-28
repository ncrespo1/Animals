package com.company;

/**
 * @author Nicolas Crespo
 * @version 2017.3.3
 */

public class Student extends Person implements Talkable {
    private int age;

    /**
     *
     * @param age   age of the student
     * @param name  name of the student
     */
    public Student(int age, String name) {
        super(name);
        this.age = age;
    }

    /**
     * @return returns Student's Age
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @param age accepts an integer and sets it as the age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return returns a string of text when talk() is called.
     */
    @Override
    public String talk() {
        return "Can we talk about my grade.";
    }
}
