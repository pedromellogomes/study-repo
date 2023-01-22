package org.acme.entity.embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PokemonStatsId implements Serializable {
    @Column(name = "fk_pokemon_id")
    public Long fkPokemonId;

    @Column(name = "fk_stat_id")
    public Long fkStatId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PokemonStatsId that = (PokemonStatsId) o;
        return Objects.equals(fkPokemonId, that.fkPokemonId) && Objects.equals(fkStatId, that.fkStatId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fkPokemonId, fkStatId);
    }

}
