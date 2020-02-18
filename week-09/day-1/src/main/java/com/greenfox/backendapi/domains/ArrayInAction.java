package com.greenfox.backendapi.domains;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ArrayInAction {
    private String error;
    private Integer result;
    private Integer[] resultArray;

    public ArrayInAction(String action, Integer[] numbers) {
        if (action == null || numbers == null) {
            this.error = "Please provide what to do with the numbers!";
        } else if (action.equals("sum")) {
            this.result = sum(numbers);
        } else if (action.equals("multiply")) {
            this.result = multiply(numbers);
        } else if (action.equals("double")) {
            this.resultArray = doubling(numbers);
        }
    }

    public ArrayInAction() {
    }

    public Integer[] getResultArray() {
        return resultArray;
    }

    public void setResultArray(Integer[] resultArray) {
        this.resultArray = resultArray;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Integer sum(Integer[] numbers) {
        Integer counter = 0;
        for (int i = 0; i <= numbers.length; i++) {
            counter += numbers[i];
        }
        return counter;
    }

    public Integer multiply(Integer[] numbers) {
        Integer counter = 1;
        for (Integer number : numbers) {
            counter *= number;
        }
        return counter;
    }

    public Integer[] doubling(Integer[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }

        return numbers;
     }
}
