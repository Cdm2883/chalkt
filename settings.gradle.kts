pluginManagement {
    repositories {
        maven("https://mirrors.huaweicloud.com/repository/maven/")
        maven("https://maven.aliyun.com/repository/public")
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        maven("https://mirrors.huaweicloud.com/repository/maven/")
        maven("https://maven.aliyun.com/repository/public")
        mavenCentral()
    }
}

@Suppress("SpellCheckingInspection")
rootProject.name = "chalkt"

include(":extension-styled")
include(":legacy-styled")
include(":shared")
include(":example")
