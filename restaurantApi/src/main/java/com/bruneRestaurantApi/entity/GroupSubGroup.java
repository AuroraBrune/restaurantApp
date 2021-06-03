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
@Table(name="GROUP_SUBGROUP_TBL")
public class GroupSubGroup {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private int groupId;
    @Column
    private int subGroupId;
}
