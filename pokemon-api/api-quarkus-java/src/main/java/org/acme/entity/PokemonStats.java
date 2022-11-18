package org.acme.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import org.acme.entity.embeddable.PokemonStatsId;

import javax.persistence.*;

@Entity
@Table(name = "pokemon_stats", uniqueConstraints = {
        @UniqueConstraint(name = "uk_pokemon_stats", columnNames = { "fk_pokemon_id", "fk_stat_id" })
})
public class PokemonStats extends PanacheEntityBase {

    @JsonIgnore
    @EmbeddedId
    public PokemonStatsId id;

    @ManyToOne()
    @JoinColumn(name = "fk_pokemon_id", insertable = false, updatable = false)
    @JsonIgnore
    public Pokemon fkPokemonId;

    @ManyToOne()
    @JoinColumn(name = "fk_stat_id", insertable = false, updatable = false)
    public Stat fkStatId;

    @Column(name = "base_stat")
    public Integer baseStat;

    @Column(name = "effort")
    public Integer effort;

}
