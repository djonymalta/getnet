package br.com.getnet.entity;

import jakarta.validation.constraints.NotBlank;

public class Pessoa {

    @NotBlank
    private String name;
    @NotBlank
    private String job;

    public Pessoa(){

    }

    public Pessoa(String name, String job) {
        this.name = name;
        this.job = job;
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

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
