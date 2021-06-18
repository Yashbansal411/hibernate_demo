package com.yash;

import javax.persistence.*;

@Entity
@Table(name="new_table")
public class alien {

    @Id
    private int aid;
    @Transient
    private String name;
    @Column(name="alien_color")
    private String color;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }
}
