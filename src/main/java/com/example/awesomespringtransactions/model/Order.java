package com.example.awesomespringtransactions.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer userId;
    private String productCode;
    private Integer amount;
    private BigDecimal unitPrice;

    @Transient
    public BigDecimal getTotalPrice(){
        return this.unitPrice.multiply(BigDecimal.valueOf(this.amount));
    }

}
