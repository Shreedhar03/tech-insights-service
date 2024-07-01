package com.peernews.peernews.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    
    // constructor
    public User(String username, String password, String email, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // getters and setters
    public String getUsername() {
        return username;
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}
