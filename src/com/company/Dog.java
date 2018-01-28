package com.company;

/**
 * @author Nicolas Crespo
 * @version 2017.3.3
 */
public class Dog extends Pet implements Talkable {
    private boolean friendly;

    /**
     *
     * @param friendly  sets if the dog is friendly or not
     * @param name      the dogs name
     */
    public Dog(boolean friendly, String name) {
        super(name);
        this.friendly = friendly;
    }

    /**
     *
     * @return returns if the dog is friendly or not.
     */
    public boolean isFriendly() {
        return friendly;
    }

    /**
     *
     * @return returns text for when the dog speaks
     */
    @Override
    public String talk() {
        return "Bark";
    }

    @Override
    public String toString() {
        return "Dog: " + "name=" + name + " friendly=" + friendly;
    }


}
