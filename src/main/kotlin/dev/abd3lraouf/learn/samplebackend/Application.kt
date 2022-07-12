package dev.abd3lraouf.learn.samplebackend

import dev.abd3lraouf.learn.samplebackend.plugins.configureRouting
import io.ktor.server.application.Application

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    configureRouting()
}
