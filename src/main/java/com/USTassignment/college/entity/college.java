package com.USTassignment.college.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class college {
    @Id
    @GeneratedValue

    public int Id;
    public int cId;
    public String name;
    public String location;
}
