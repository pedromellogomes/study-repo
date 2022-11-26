package service

type Service interface {
	FetchPokemon()
}

type service struct {
}

func New(r Repository) Service {
	return nil
}
