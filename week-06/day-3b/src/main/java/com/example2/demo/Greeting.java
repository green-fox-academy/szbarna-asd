package com.example2.demo;


import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    private long id;
    private static AtomicLong atomicLong = new AtomicLong(0);
    private String content;
    private long greetCounter;


    public Greeting(long greetCounter) {
        this.greetCounter = greetCounter;
       // this.content = content;
    }

    public long getGreetCounter() {
        greetCounter = atomicLong.incrementAndGet();
        return greetCounter;

    }

    public String getContent() {
        return content;
    }
}
