package org.example.immutable;

import org.example.human.Person;

public final class CustomImmutableClass {
    // There is no any setter methods

    @Override
    public String toString() {
        return "CustomImmutableClass{" +
                "length=" + length +
                ", description='" + description + '\'' +
                ", person=" + person +
                '}';
    }

    public CustomImmutableClass(int length, String description, Person person) {
        this.length = length;
        this.description = description;
        this.person = person;
    }

    private final int length;
    private final String description;

    private final Person person;

    public int getLength() {
        return length;
    }

    public String getDescription() {
        return description;
    }

    public Person getPerson() throws CloneNotSupportedException {
        return person.clone();
    }
}
