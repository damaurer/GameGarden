package de.maurer.gamegarden.model.enums

enum class Roles(val value: String) {
    USER("USER"), ADMIN("ADMIN");

    override fun toString(): String {
        return value
    }

}