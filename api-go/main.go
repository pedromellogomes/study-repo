package main

import (
	"net/http"

	"github.com/gin-gonic/gin"
)

type user struct {
	ID   string `json:"id"`
	Name string `json:"name"`
}

var users = []user{
	{ID: "1", Name: "Fulano 1"},
	{ID: "2", Name: "Fulano 2"},
}

func getUsers(c *gin.Context) {
	c.IndentedJSON(http.StatusOK, users)
}

func main() {
	router := gin.Default()
	router.GET("/users", getUsers)

	router.Run("localhost:8080")
}
