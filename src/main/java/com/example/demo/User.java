package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    private String name;
    private int age;
    @JsonProperty("phone_number")
    private String phoneNumber;

    public User(){
        this.name = null;
        this.age = 0;
        this.phoneNumber = null;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public User(String name, int age, String phoneNumber) {

        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // ObjectMapper에서는 Method 이름으로 get을 사용하지 못한다.
//    public User getDefaultUser(){
//        return new User("default", 0);
//    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
