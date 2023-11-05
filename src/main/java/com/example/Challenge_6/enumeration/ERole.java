package com.example.Challenge_6.enumeration;

public enum ERole {
    ROLE_CUSTOMER("ROLE_CUSTOMER"),
    ROLE_ADMIN("ROLE_ADMIN"),
    ROLE_MERCHANT("ROLE_MERCHANT"),
    ROLE_USER("ROLE_USER");

    private String name;

    ERole(String name) {
        this.name = name;
    }
}
