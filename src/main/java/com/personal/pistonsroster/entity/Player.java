package com.personal.pistonsroster.entity;

import jakarta.persistence.*;

@Entity
@Table(name="player")
public class Player {
    // define fields
    @Id
    @Column(name="number")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="position")
    private String position;

}
