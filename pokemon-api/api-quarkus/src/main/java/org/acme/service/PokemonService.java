package org.acme.service;

import org.acme.entity.Pokemon;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PokemonService {

    public Pokemon findByIdOrThrow(Long id) {
        return Pokemon
                .findByIdOptional(id)
                .map(Pokemon.class::cast)
                .orElseThrow(RuntimeException::new);
    }
    public Pokemon findByIdentifierOrThrow(String identifier) {
        return Pokemon
                .findByIdentifierOptional(identifier)
                .map(Pokemon.class::cast)
                .orElseThrow(RuntimeException::new);
    }

}
