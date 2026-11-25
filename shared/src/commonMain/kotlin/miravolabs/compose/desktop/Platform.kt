package miravolabs.compose.desktop

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform