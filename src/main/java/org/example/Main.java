package org.example;

import org.example.functional_interface.CustomFunctionalInterface;
import org.example.human.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    // TODO
    // Functional Interfaces and Lambda Expressions
    // Stream API, ForEach() method
    // Type Inference <-> Method references
    // Function API
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

        /*LocalDate date = LocalDate.of(2022, 12, 31);

         *//*CustomImmutableClass im = new CustomImmutableClassImpl(12, "text",
                new Person(32, "Pavel"));*//*  // braking immutability

        CustomImmutableClass im = new CustomImmutableClass(12, "text",
                new Person(32, "Pavel"));

//        im.getPerson().setAge(56);

//        ((CustomImmutableClassImpl)im).setHuman(new Human(UUID.randomUUID(),"edew"));

        Thread transaction1 = new Thread() {
            @Override
            public void run() {
                System.out.println("abc");
            }
        };
        transaction1.start();*/

       /* Thread transaction2 = new Thread(
                () -> System.out.println("dcew")
        );
        transaction2.start();*/

//        System.out.println(im);

        String output = doWork(23,
                (s, c) -> { // type erasure
                    System.out.println("I am working on: " + s);
                    c.accept(s + "[]");

                    return s.toString();
                }  // will be evaluated and invoked later on
        );

        /*String output = doWork(23, new CustomFunctionalInterface<String>() {
            @Override
            public String doSomething(String s, Consumer<String> consumer) {
                System.out.println("I am working on: " + s);
                consumer.accept(s + "[]");

                return s.toString();
            }
        });*/

        System.out.println(output);

        List<Integer> numbers = Arrays.asList(32, 43, 5, -2, 453, 15, 0);

        System.out.println(sort(numbers));

        List<Person> people = Arrays.asList(
                new Person(12, "Mkrtich"),
                new Person(34, "Davit"),
                new Person(2, "Ruben"),
                new Person(52, "Lilit"),
                new Person(32, "Aram"),
                new Person(7, "Mariam"),
                new Person(5, "Vazgen"),
                new Person(13, "Lilit"),
                new Person(56, "Anna")
        );
        // sort by age/name

        // Terminal and Intermediate operation
//        people.sort((p1, p2) -> p1.getAge() - p2.getAge());
        /*people.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));

        List<Person> res = people.stream()
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .collect(Collectors.toList());

        System.out.println(res);*/

        Stream<String> stringStream = people.stream()
                .map((p) -> p.getName())
                .map(name -> name + " Avagyan");

        List<String> fullNames = stringStream.filter(n -> n.charAt(0) != 'M')
                .distinct()
                .collect(Collectors.toList());

        // we can only use one Terminal operation for a stream
//        stringStream.forEach((s) -> {});

        System.out.println(fullNames);
    }

    public static List<Integer> sort(List<Integer> input) {
        Collections.sort(input);
        return input;
    }

    public static String doWork(int num, CustomFunctionalInterface<String> obj) {
        UUID id = UUID.randomUUID();
        return obj.doSomething("My task with number 12", t -> {
            System.out.println(id);
            System.out.println(t);
        });
    }

    // Immutable classes
}