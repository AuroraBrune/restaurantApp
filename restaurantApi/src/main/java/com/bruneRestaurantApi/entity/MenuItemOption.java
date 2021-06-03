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
@Table(name="MENU_ITEM_OPTION_TBL")
public class MenuItemOption {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String optionName;
    @Column
    private float price;
    @Column
    private boolean active;
}
