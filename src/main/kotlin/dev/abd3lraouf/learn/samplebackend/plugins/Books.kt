package dev.abd3lraouf.learn.samplebackend.plugins

import io.ktor.server.application.Application
import io.ktor.server.application.call
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.routing

fun Application.configureBooks() {

    routing {
        get("/books") {
            call.respondText("Book 1")
        }
    }
}
