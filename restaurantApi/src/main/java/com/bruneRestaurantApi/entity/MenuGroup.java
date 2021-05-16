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
@Table(name="MENU_GROUP_TBL")
public class MenuGroup {
    @Id
    @GeneratedValue
    private int id;
    @Column(unique=true)
    private String  groupName;
    @Column(unique=true)
    private int groupSeqNum;
    private String groupStatus;

}

