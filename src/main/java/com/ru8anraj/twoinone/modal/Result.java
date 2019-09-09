package com.ru8anraj.twoinone.modal;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Result {
    @JsonProperty("results")
    private List<Movie> result;

    public Result() {

    }
    public Result(List<Movie> result) {
        this.result = result;
    }
    public List<Movie> getResults() {
        return result;
    }

    public void setResult(List<Movie> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Result{" +
                "results=" + result +
                '}';
    }
}
