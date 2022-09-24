package com.buu.bcs.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "tab_users")
public class UsersEntity {

    public enum GenderType {
        MALE, FEMALE
    }

    public enum FlagType {
        USER, ADMIN
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "gender")
    private GenderType gender;

    @Column(name = "birthdate")
    private LocalDateTime birthdate;

    @Column(name = "province")
    private String province;

    @Column(name = "amphoe")
    private String amphoe;

    @Column(name = "district")
    private String district;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "flag")
    private String flag;

    @Column(name = "create_date")
    private LocalDateTime create_date;

    @Column(name = "create_by")
    private String create_by;

    @Column(name = "update_date")
    private LocalDateTime update_date;

    @Column(name = "update_by")
    private String update_by;
}
