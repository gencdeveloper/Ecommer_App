package com.ecommerce.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Table(name = "orders")
@Getter
@Setter
public class Order extends BaseEntity{

    private BigDecimal paidPrice;
    private BigDecimal totalPrice;

    @OneToOne
    private Cart cart;

    @ManyToOne
    private Customer customer;

    @OneToOne
    private Payment payment;
}
