package com.greenfox.backendapi.domains;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DoItTill {
    private Integer result;
    private String error;

    public DoItTill(String action, Integer until) {
        if(until == null){
            this.error = "Please provide a number!";
        }else if(action.equals("sum")) {
            this.result = doSum(until);
        }else if(action.equals("factor")){
            this.result = doFactor(until);
        }
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Integer doSum(Integer integer) {
        Integer counter = 0;
        for (int i = 0; i <= integer; i++) {
            counter += i;
        }
        return counter;
    }

    public Integer doFactor(Integer integer) {
        Integer counter = 1;
        for (int i = 0; i < integer; i++) {
            counter += counter * i;
        }
        return counter;
    }
}
