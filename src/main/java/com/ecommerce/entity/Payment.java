package com.ecommerce.entity;

import com.ecommerce.enums.PaymentMethod;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Payment extends BaseEntity{

    private BigDecimal paidPrice;

    @Enumerated(value = EnumType.STRING)
    private PaymentMethod paymentMethod;
}
