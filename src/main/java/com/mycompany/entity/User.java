/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author User
 */
public class User {
    private int id;
    private String name;
    private String surname;
    private String phone; 
    private String email;
    private Date birtDate;
    private Country nationality;
    private Country birthplace;
    private List<UserSkill>skills;
    public User() {
    }

    public User(int id) {
        this.id = id;
    }

    public User(int id, String name, String surname, String phone, String email, Date birtDate, Country nationality, Country birthplace) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.birtDate = birtDate;
        this.nationality = nationality;
        this.birthplace = birthplace;
    }

 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(Date birtDate) {
        this.birtDate = birtDate;
    }

    public Country getNationality() {
        return nationality;
    }

    public void setNationality(Country nationality) {
        this.nationality = nationality;
    }

    public Country getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(Country birthplace) {
        this.birthplace = birthplace;
    }

    public List<UserSkill> getSkills() {
        return skills;
    }

    public void setSkills(List<UserSkill> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", phone=" + phone + ", email=" + email + ", birtDate=" + birtDate + ", nationality=" + nationality + ", birthplace=" + birthplace + '}';
    }

    
}
