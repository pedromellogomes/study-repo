package org.acme.service;

import org.acme.entity.Pokemon;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PokemonService {

    public Pokemon findByIdOptionalOrThrow(Long id) {
        return Pokemon
                .findByIdOptional(id)
                .map(Pokemon.class::cast)
                .orElseThrow(RuntimeException::new);
    }
    public Pokemon findByIdentifier(String identifier) {
        return Pokemon
                .findByIdentifierOptional(identifier)
                .orElseThrow(RuntimeException::new);
    }

}
