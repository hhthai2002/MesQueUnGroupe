package com.stackbug.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Users")
public class Users {
    @Id
    private Integer user_id;
    private String display_name;
    private String email;
    private String password;
    private String avatar;
    private boolean status;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id", referencedColumnName = "role_id")
    private Roles role;
}
