package org.acme.entity;


import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.util.Optional;
import java.util.Set;

@Entity
public class Pokemon extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String identifier;

    @Column(name = "species_id")
    public Integer speciesId;

    public Integer height;

    public Integer weight;

    @Column(name = "base_experience")
    public Integer baseExperience;

    public Integer order;

    @Column(name = "is_default")
    public Boolean isDefault;

    @ManyToMany
    @JoinTable(
        name = "pokemon_ability",
        joinColumns = @JoinColumn(name = "fk_pokemon_id"),
        inverseJoinColumns = @JoinColumn(name = "fk_ability_id")
    )
    public Set<Ability> abilities;

    @ManyToMany
    @JoinTable(
        name = "pokemon_stats",
        joinColumns = @JoinColumn(name = "fk_pokemon_id"),
        inverseJoinColumns = @JoinColumn(name = "fk_stat_id")
    )
    public Set<Stat> stats;

    public static Optional<Pokemon> findById(Long id) {
        return findByIdOptional(id);
    }

    public static Optional<Pokemon> findByIdentifier(String identifier) {
        return find("identifier", identifier).firstResultOptional();
    }

}
