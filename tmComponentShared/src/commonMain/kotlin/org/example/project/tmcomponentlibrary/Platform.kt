package org.example.project.tmcomponentlibrary

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform