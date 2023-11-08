package com.ecommerce.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Address  extends BaseEntity{



    private String name;
    private String stree;
    private String zipCode;

    @ManyToOne
    private Customer customer;
}
