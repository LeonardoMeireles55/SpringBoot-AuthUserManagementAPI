package com.leonardo.auth.spring.enums;

import lombok.Getter;

@Getter
public enum UserRoles {
    FREE("FREE"),
    PREMIUM("PREMIUM"),
    ADMIN("ADMIN");

    private final String roles;

    UserRoles(String role) {
        this.roles = role;
    }
}
