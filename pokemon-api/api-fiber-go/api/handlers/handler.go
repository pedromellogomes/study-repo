package handlers

import (
	service "api-fiber-go/pkg/services"

	"github.com/gofiber/fiber/v2"
)

func GetPokemon(service service.Service) fiber.Handler {
	return func(c *fiber.Ctx) error {
		return c.JSON("")
	}
}

func GetPokemons(service service.Service) fiber.Handler {
	return func(c *fiber.Ctx) error {
		return c.JSON("")
	}
}
