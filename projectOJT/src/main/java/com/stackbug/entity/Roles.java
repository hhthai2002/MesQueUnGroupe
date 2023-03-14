package com.stackbug.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Roles")
public class Roles {
    @Id
    private Integer role_id;
    private String role_name;
    @OneToOne(mappedBy = "role")
    private Users user;
}
