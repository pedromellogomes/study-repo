package org.acme.resource.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

@JsonSerialize
@JsonIgnoreProperties({ "id", "damageClassId", "isBattleOnly", "gameIndex" })
public record StatDTO(Long id,
                      Long damageClassId,
                      String identifier,
                      Boolean isBattleOnly,
                      Integer gameIndex) implements Serializable {
}