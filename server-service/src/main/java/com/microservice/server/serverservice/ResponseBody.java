package com.microservice.server.serverservice;

public class ResponseBody {
    private String port;
    private String name;

    public String getName() {
        return name;
    }

    public void setName1(String name1) {
        this.name = name1;
    }

    public ResponseBody() {
    }

    public ResponseBody(String port, String name) {
        this.port = port;
        this.name = name;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

}
