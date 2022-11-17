package org.acme.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
public class Stat extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "damage_class_id")
    public Long damageClassId;

    public String identifier;

    @Column(name = "is_battle_only")
    public Boolean isBattleOnly;

    @Column(name = "game_index")
    public Integer gameIndex;

}
