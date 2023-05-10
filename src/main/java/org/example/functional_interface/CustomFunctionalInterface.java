package org.example.functional_interface;

import java.util.function.Consumer;

//@FunctionalInterface
public interface CustomFunctionalInterface<T> {

    String doSomething(T t, Consumer<T> consumer);

//    String doSomethingElse(T t, Consumer<T> consumer);


    default void customWork(T t) {
        System.out.println(t);
    }
}
