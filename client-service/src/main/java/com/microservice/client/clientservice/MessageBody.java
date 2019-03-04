package com.microservice.client.clientservice;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageBody {

    @JsonProperty("random id")
    @JsonAlias("id")
    private Integer id;

    @JsonAlias("name")
    @JsonProperty("user name")
    private String name;


    @JsonProperty("server port number")
    @JsonAlias("port")
    private String port;

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
