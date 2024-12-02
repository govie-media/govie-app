package io.govie.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform