package de.larmic.kotlin.bug

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LightBotApplication

fun main(args: Array<String>) {
    runApplication<LightBotApplication>(*args)
}
