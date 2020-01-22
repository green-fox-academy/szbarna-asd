package com.example2.demo;


import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    private long id;
    private String content;
    private long greetCounter;
    static AtomicLong atomicLong = new AtomicLong(1);

    public Greeting(long id, String content) {
        this.greetCounter = id;
        this.content = content;
    }

    public long getId() {
        greetCounter = atomicLong.incrementAndGet();
        return greetCounter;

    }

    public String getContent() {
        return content;
    }
}
