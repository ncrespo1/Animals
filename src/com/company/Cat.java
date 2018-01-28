package com.company;

/**
 * @author Nicolas Crespo
 * @version 2017.3.3
 */
public class Cat extends Pet implements Talkable {
    private int mousesKilled;

    /**
     *
     * @param mousesKilled  total mouses killed by the cat
     * @param name          name of the cat
     */
    public Cat(int mousesKilled, String name) {
        super(name);
        this.mousesKilled = mousesKilled;
    }

    /**
     *
     * @return returns the mouses killed
     */
    public int getMousesKilled() {
        return mousesKilled;
    }


    public void addMouse() {
        mousesKilled++;
    }

    /**
     *
     * @return returns text for when the cat speaks
     */
    @Override
    public String talk() {
        return "Meow";
    }

    @Override
    public String toString() {
        return "Cat: " + "name=" + name + " mousesKilled=" + mousesKilled;
    }
}