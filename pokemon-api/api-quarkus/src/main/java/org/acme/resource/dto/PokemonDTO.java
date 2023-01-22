package org.acme.resource.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.util.Set;

@JsonSerialize
@JsonIgnoreProperties({ "id" })
public record PokemonDTO(Long id,
                        String identifier,
                        Integer speciesId,
                        Integer height,
                        Integer weight,
                        Integer baseExperience,
                        Integer order,
                        Boolean isDefault,
                        Set<AbilityDTO> abilities) implements Serializable {}