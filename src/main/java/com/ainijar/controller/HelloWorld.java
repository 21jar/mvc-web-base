package com.ainijar.controller;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    public static void main (String[] args) {
        System.out.println("hello");
    }

    public String all (String a) {
        System.out.println(a);
        return a;
    }
}
