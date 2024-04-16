package com.uep.wap.model;

import javax.persistence.*;

@Entity
@Table(name="Products")
public class Product{
    @Id
    @Column(name ="id")
    private char id;
    @Column(name ="name")
    private String name;
    @Column(name ="price")
    private double  price;

    @Column(name = "availability")
    private boolean availability;

    @Column(name = "description")
    private String description;

    public void setId(char id){
        this.id = id;
    }
    public char getId(){
        return id;
    }
    public Product(){

    }
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Integer points) {
        this.price = price;
    }

    public boolean getAvailability(){return availability; }

    public void setAvailability(boolean availability) {this.availability = availability; }

    public String getDescription (){return description; }

    public void setDescription (String description) {this.description = description; }

    public Product(String name, Integer points){

    }
}