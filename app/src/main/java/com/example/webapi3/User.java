package com.example.webapi3;

public class User {
    private String name;
    private String job;
    private String id;
    private String CreatedAt;

    public User(String name, String job, String id, String createdAt) {
        this.name = name;
        this.job = job;
        this.id = id;
        CreatedAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(String createdAt) {
        CreatedAt = createdAt;
    }
}
