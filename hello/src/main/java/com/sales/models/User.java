package com.sales.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Raysmond<i@raysmond.com>
 */
@Entity
@Table(name = "users")
public @Data class User extends BaseModel {
    public static final String ROLE_ADMIN = "ROLE_ADMIN";
    public static final String ROLE_USER  = "ROLE_USER";

    @Column(unique = true)
    private String mobile;

    public User(String mobile, String password, String role) {
        this.mobile = mobile;
        this.password = password;
        this.role = role;
    }

    @JsonIgnore

    private String password;

    private String role = ROLE_USER;

    public User() {

    }
}
