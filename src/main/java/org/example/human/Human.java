package org.example.human;

import java.util.UUID;

public class Human {
    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", address='" + address + '\'' +
                '}';
    }

    private UUID id;
    private String address;

    public Human(UUID id, String address) {
        this.id = id;
        this.address = address;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
