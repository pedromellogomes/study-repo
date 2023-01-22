package org.acme.resource.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

@JsonSerialize
@JsonIgnoreProperties({ "id", "fkPokemonId" })
public record PokemonStatsDTO(PokemonStatsIdDTO id,
                            Integer baseStat,
                            Integer effort) implements Serializable {}