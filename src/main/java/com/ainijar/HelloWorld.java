package com.ainijar;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    public static void main (String[] args) {
        System.out.println("hello");
    }

    public String say (String a) {
        System.out.println("say " + a);
        return "say " + a;
    }

    @Scheduled(cron = "0 0 0/5 * * ?")
    public void hello () {
        System.out.println("say hello world");
    }
}
