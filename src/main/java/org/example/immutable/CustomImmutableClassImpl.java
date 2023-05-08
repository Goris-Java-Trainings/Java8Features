package org.example.immutable;

import org.example.human.Human;

public class CustomImmutableClassImpl /*extends CustomImmutableClass*/ {

    private Human human;
    /*public CustomImmutableClassImpl(int length, String description, Person person) {
        super(length, description, person);
    }*/

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    @Override
    public String toString() {
        return super.toString() + "\n CustomImmutableClassImpl{" +
                "human=" + human +
                '}';
    }
}
