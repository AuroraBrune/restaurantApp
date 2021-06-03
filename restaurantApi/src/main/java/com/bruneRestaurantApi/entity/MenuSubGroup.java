package com.bruneRestaurantApi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// when using lombok in new project... intelliJ you need to have the Lombok plugin installed

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="MENU_SUBGROUP_TBL")
public class MenuSubGroup {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String subGroupName;
    @Column
    private int sGSequenceNumber;

}