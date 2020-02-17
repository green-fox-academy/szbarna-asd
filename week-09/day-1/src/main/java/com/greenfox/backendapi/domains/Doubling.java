package com.greenfox.backendapi.domains;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Doubling {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer received;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer result;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String error;

    public Doubling(Integer received) {
        this.received = received;
        this.result = received * 2;
        this.error = null;
    }

    public Doubling() {
        this.received = null;
        this.result = null;
        this.error = "Please provide an input!";
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Integer getReceived() {
        return received;
    }

    public void setReceived(int received) {
        this.received = received;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
