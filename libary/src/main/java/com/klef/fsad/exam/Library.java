package com.klef.fsad.exam;



import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "library")
public class Library 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;

   

    private String status;

    // Constructors
    public Library() {}

    public Library(String name, String description, String status) {
        this.name = name;
        this.description = description;
   
        this.status = status;
    }

    // Getters and Setters
    public int getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }


    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}