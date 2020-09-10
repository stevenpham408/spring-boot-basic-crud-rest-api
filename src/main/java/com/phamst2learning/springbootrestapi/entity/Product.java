package com.phamst2learning.springbootrestapi.entity;
/*
    Product is a model class.
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PRODUCT_TBL")
public class Product {
    @Id
    @GeneratedValue
    private int product_id;
    private String product_name;
    private int product_price;
    private int quantity;
}