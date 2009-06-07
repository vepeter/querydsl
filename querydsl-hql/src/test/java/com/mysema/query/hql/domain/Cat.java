/*
 * Copyright (c) 2009 Mysema Ltd.
 * All rights reserved.
 * 
 */
package com.mysema.query.hql.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * The Class Cat.
 */
@Entity
public class Cat extends Animal {
    int breed;
    Color eyecolor;
    @OneToMany
    List<Cat> kittens;
    @ManyToOne
    Cat mate;

    public Cat(){}
    
    public Cat(String name, int id){
        this.id = id;
        this.name = name;
    }
    
    public int getBreed() {
        return breed;
    }

    public Color getEyecolor() {
        return eyecolor;
    }

    public List<Cat> getKittens() {
        return kittens;
    }

    public Cat getMate() {
        return mate;
    }
}