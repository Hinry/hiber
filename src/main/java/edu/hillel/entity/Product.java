package edu.hillel.entity;

import javax.persistence.*;

/**
 * Created by HillelNew8 on 16.12.2016.
 */
@Entity @Table
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "position", length = 50)
    private String name;
    @Column(length = 500)
    private String descr;
    @Column(precision = 2, scale = 16)
    private double cost;

    public Product(){}

    public Product(String name, String desc, double cost) {

        this.name = name;
        this.descr = desc;
        this.cost = cost;
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

    public String getDesc() {
        return descr;
    }

    public void setDesc(String desc) {
        this.descr = desc;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + descr + '\'' +
                ", cost=" + cost +
                '}';
    }
}
