package com.company;

/**
 * @author Nicolas Crespo
 * @version 2017.3.3
 */
public abstract class Pet {

    protected String name;

    /**
     *
     * @param name  sets the name of the pet
     */
    public Pet(String name) {
        this.name = name;
    }

    /**
     *
     * @return  returns name of the Pet
     */
    public String getName() {
        return name;
    }


}
