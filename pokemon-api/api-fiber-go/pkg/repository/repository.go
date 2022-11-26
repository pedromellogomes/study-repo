package repository

import (
	"api-fiber-go/pkg/entities"
)

type Repository interface {
	ReadPokemon() (*[]entities.Pokemon, error)
}

type repository struct {
}

func New() Repository {
	return nil
}
