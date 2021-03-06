package com.bkpw.projektkoncowy.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "roles")
public class Role extends BaseEntity {

    @NotNull
    @Column(name = "role", nullable = false)
    private String role;
}
