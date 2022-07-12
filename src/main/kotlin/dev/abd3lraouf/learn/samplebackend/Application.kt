package dev.abd3lraouf.learn.samplebackend

import dev.abd3lraouf.learn.samplebackend.plugins.configureBooks
import dev.abd3lraouf.learn.samplebackend.plugins.configureRouting
import io.ktor.server.application.Application

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.rootModule() {
    configureRouting()
}

@Suppress("unused")
fun Application.bookModule() {
    configureBooks()
}
