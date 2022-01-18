package com.akshayashokcode.routes

import com.akshayashokcode.data.model.Rabbit
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private const val BASE_URL="http://192.168.203.40:8080/"

private val rabbits = listOf(
    Rabbit("Carl", "A cute brown rabbit", "$BASE_URL/rabbits/1.jpg"),
    Rabbit("Emma", "Emma likes to eat apples", "$BASE_URL/rabbits/2.jpg"),
    Rabbit("Florian", "Florian is always hungry", "$BASE_URL/rabbits/3.jpg"),
    Rabbit("Federico", "Federico likes to climb mountains", "$BASE_URL/rabbits/4.jpg"),
    Rabbit("Gina", "Gina is a true beauty", "$BASE_URL/rabbits/5.jpg")
)

fun Route.randomRabbit(){
    get("/randomrabbit"){
        call.respond(
            HttpStatusCode.OK,
            rabbits.random()
        )
    }
}