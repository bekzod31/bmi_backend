package com.emp.employees.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String first_name, last_name, profession ,date_of_born, region, phone_number, image;

    public Post() {
    }

    public Post(String first_name, String last_name, String profession, String date_of_born, String region, String phone_number, String image) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.profession = profession;
        this.date_of_born = date_of_born;
        this.region = region;
        this.phone_number = phone_number;
        this.image = image;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getDate_of_born() {
        return date_of_born;
    }

    public void setDate_of_born(String date_of_born) {
        this.date_of_born = date_of_born;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
