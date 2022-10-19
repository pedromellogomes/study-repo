package org.acme.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
;import javax.persistence.*;

@Entity
public class Ability extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String identifier;

    @Column(name = "generation_id")
    public Integer generationId;

    @Column(name = "is_main_series")
    public Boolean isMainSeries;

}
