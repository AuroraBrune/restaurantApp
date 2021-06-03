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
@Table(name="ORDER_ITEM_TBL")
public class OrderItem {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private int orderId;
    @Column
    private int menuItemId;
}

