pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        jcenter()
        maven { url = uri("https://maven.aliyun.com/repository/releases") }
        maven { url = uri("https://jitpack.io") }
    }
}

rootProject.name = "ksbaoprojectofhybrid"
include(":app")
include(":library")
include(":Aliyunplayerlibrary")
