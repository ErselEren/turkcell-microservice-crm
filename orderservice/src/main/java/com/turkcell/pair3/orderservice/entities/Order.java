package com.turkcell.pair3.orderservice.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(value="orders")
public class Order {
    @Id
    private String id;
    private LocalDate orderDate;
    private int customerId;
    private double totalPrice;
}
