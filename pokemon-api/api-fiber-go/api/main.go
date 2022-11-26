package main

import (
	"api-fiber-go/api/routes"
	"api-fiber-go/pkg/repository"
	service "api-fiber-go/pkg/services"

	"github.com/gofiber/fiber/v2"
)

func main() {
	app := fiber.New(fiber.Config{
		AppName: "pokemon-api-fiber-go",
	})

	api := app.Group("/api")
	v1 := api.Group("/v1")

	pokemonRepository := repository.New()
	pokemonService := service.New(pokemonRepository)

	routes.Routes(v1, pokemonService)

	app.Listen(":8080")
}

func dbConnection() {

}
