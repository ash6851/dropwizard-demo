package com.demo.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeting {
    private final String greeting;

    public Greeting(String greeting) {
        this.greeting = greeting;
    }

    @JsonProperty
    public String getGreeting() {
        return greeting;
    }
}
