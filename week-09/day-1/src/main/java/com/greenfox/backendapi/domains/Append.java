package com.greenfox.backendapi.domains;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Append {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String appended;

    public Append(String word) {
        this.appended = word;
    }

    public Append() {
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }
}
