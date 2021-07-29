pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

rootProject.name = "Luna"

include("Luna-API", "Luna-Server", "Luna-MojangAPI")