plugins {
    alias(libs.plugins.kotlin.jvm)
}

dependencies {
    implementation(project(":chain-styled"))
    implementation(project(":legacy-styled"))
}
