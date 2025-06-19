package com.puneet.user.usermanagementserv.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "users")
public class User extends Base{

    private String name;
    private String email;
    private String password;
    @ManyToMany
    private List<Role> roles;
}
