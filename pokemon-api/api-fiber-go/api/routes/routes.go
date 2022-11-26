package routes

import (
	"api-fiber-go/api/handlers"
	service "api-fiber-go/pkg/services"

	"github.com/gofiber/fiber/v2"
)

func Routes(app fiber.Router, service service.Service) {
	app.Get("/pokemon", handlers.GetPokemon(service))
	app.Get("/pokemons", handlers.GetPokemons(service))
}
