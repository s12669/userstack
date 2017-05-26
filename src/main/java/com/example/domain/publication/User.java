package com.example.domain.publication;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    public String name;

    @Column(name = "surname")
    private String surname;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Column(name = "dateOfBirth")
    private Date dateOfBirth;
    @Column(name = "indexNumber")
    private int indexNumber;
    @Column(name = "email")
    private String email;

//    public User(int id, String name, String surname, Date dateOfBirth, int indexNumber, String email) {
//        this.setId(id);
//        this.setName(name);
//        this.setSurname(surname);
//        this.setDateOfBirth(dateOfBirth);
//        this.setIndexNumber(indexNumber);
//        this.setEmail(email);
//    }

    public User() {

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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
