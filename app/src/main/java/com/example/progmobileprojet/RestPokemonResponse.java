package com.example.progmobileprojet;

import java.util.List;

public class RestPokemonResponse {
    private Integer count;
    private String next, previous;
    private List<Pokemon> results;

    public Integer getCount() {
        return count;
    }

    public String getNext() {
        return next;
    }

    public String getPrevious() {
        return previous;
    }

    public List<Pokemon> getResults() {
        return results;
    }
}
