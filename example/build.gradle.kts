plugins {
    alias(libs.plugins.kotlin.jvm)
}

dependencies {
    implementation(project(":extension-styled"))
    implementation(project(":legacy-styled"))
}
