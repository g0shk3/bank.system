package com.bank.bank.system.model;

import javax.persistence.*;

@Entity
@Table(name = "features")
public class Feature {

    @Id
    private Long id;
    @Column
    private Long price;
    @Column
    private String description;
    @Column
    private String name;

    public Long getId() {
        return id;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}