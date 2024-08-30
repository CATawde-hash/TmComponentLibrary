enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    repositories {
        google()
        maven { url = uri("https://jitpack.io") } // Add JitPack repository here
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        maven { url = uri("https://jitpack.io") } // Add JitPack repository here
        mavenCentral()
    }
}

rootProject.name = "TmComponentLibrary"
include(":tmComponentShared")