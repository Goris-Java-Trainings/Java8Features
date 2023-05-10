package org.example.functional_interface.impl;

import org.example.functional_interface.CustomFunctionalInterface;

import java.util.function.Consumer;

public class CustomFunctionalInterfaceImpl<T> implements CustomFunctionalInterface<T> {
    @Override
    public String doSomething(T t, Consumer<T> consumer) {
        consumer.accept(t);
        return t.toString();
    }
/*
    @Override
    public String doSomethingElse(T t, Consumer<T> consumer) {
        return null;
    }*/
}
