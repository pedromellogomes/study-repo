package org.acme.resource.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

@JsonSerialize
@JsonIgnoreProperties({ "id", "isMainSeries" })
public record AbilityDTO(Long id,
                         @JsonProperty("name")
                         String identifier,
                         Integer generationId,
                         Boolean isMainSeries) implements Serializable {}