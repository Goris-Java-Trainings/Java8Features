package org.example;

import org.example.human.Person;
import org.example.immutable.CustomImmutableClass;

import java.time.LocalDate;

public class Main {

    // TODO
    // Stream API
    // Functional Interfaces and Lambda Expressions
    // Type Inference <-> Method references
    // Function API
    // ForEach() method
    // Optional-s
    // Base64 Encode Decode
    // Collectors class
    // JDBC Enhancements
    // DateTime API classes included java.time package became thread safe

    public static void main(String[] args) throws CloneNotSupportedException {
        /*String str = "asdew";
        System.out.println(str.hashCode());

        str += "wdxw";
        System.out.println(str.hashCode());
*/
//        ConcurrentHashMap
//        HashMap

        LocalDate date = LocalDate.of(2022, 12, 31);

        /*CustomImmutableClass im = new CustomImmutableClassImpl(12, "text",
                new Person(32, "Pavel"));*/  // braking immutability

        CustomImmutableClass im = new CustomImmutableClass(12, "text",
                new Person(32, "Pavel"));

//        im.getPerson().setAge(56);

//        ((CustomImmutableClassImpl)im).setHuman(new Human(UUID.randomUUID(),"edew"));

        System.out.println(im);
    }

    // Immutable classes
}