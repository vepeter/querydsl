/*
 * Copyright (c) 2009 Mysema Ltd.
 * All rights reserved.
 * 
 */
package com.mysema.query.hql.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.IndexColumn;

/**
 * The Class Order.
 */
@Entity
public class Order {
    @ManyToOne
    Customer customer;
    @CollectionOfElements
    @IndexColumn(name = "_index")
    List<Integer> deliveredItemIndices;
    @Id
    long id;
    @OneToMany
    @IndexColumn(name = "_index")
    List<Item> items, lineItems;
    boolean paid;
}