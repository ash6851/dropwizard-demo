package com.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

public class HelloWorldConfiguration extends Configuration {
    @NotEmpty
    private String version;

    public String getVersion() {
        return this.version;
    }

    @JsonProperty
    public void setVersion(String version) {
        this.version = version;
    }
}
