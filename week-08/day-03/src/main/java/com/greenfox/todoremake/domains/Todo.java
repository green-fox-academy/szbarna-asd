package com.greenfox.todoremake.domains;

import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private boolean urgent;
    private boolean done;

    public Todo() {
    }

    public Todo(String title) {
        this.title = title;
    }

    public Todo(Long id, String title, boolean urgent, boolean done) {
        this.id = id;
        this.title = title;
        this.urgent = urgent;
        this.done = done;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String isUrgent() {
        if (!this.urgent) {
            return "Not urgent";
        } else {
            return "Urgent!";
        }
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public String isDone() {
        if (!this.done) {
            return "Not done yet";
        } else {
            return "Done!";
        }
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}