package com.sda.programowanie1;

public class User {

    private String userName;
    private String userLastName;

    public User (String userName, String userLastName){
        this.userLastName = userLastName;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                '}';
    }
}
