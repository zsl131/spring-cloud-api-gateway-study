package com.zslin.model;

import javax.persistence.*;

/**
 * Created by zsl-pc on 2016/8/24.
 */
@Entity
@Table(name="t_u")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
