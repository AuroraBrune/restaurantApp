package com.bruneRestaurantApi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// when using lombok in new project... intelliJ you need to have the Lombok plugin installed

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="ORDER_TBL")
public class Order {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private int customerId;
    @Column
    private float totalItemsPrice;
    @Column
    private float tax;
    @Column
    private float tip;
    @Column
    private float totalDue;
    @Column
    private String billingType;
}
