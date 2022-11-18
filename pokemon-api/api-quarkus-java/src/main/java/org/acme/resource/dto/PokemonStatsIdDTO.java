package org.acme.resource.dto;

import java.io.Serializable;

public record PokemonStatsIdDTO(Long fkPokemonId, Long fkStatId) implements Serializable {}