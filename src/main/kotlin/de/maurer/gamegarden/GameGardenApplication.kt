package de.maurer.gamegarden

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GameGardenApplication

fun main(args: Array<String>) {
    runApplication<GameGardenApplication>(*args)
}
