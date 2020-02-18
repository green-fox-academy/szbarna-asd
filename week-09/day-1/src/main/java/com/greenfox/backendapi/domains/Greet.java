package com.greenfox.backendapi.domains;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Greet {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String error;
    private String welcome_message;

    public Greet(String name, String title) {
        this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
    }

    public Greet() {
        this.error = "Please provide a name and a title!";
    }

    public Greet(String error) {
        this.error = error;
    }

    public String getWelcome_message() {
        return welcome_message;
    }

    public void setWelcome_message(String welcome_message) {
        this.welcome_message = welcome_message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
