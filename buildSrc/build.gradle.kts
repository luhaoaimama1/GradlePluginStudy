//https://quickbirdstudios.com/blog/gradle-kotlin-buildsrc-plugin-android/
plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
}

gradlePlugin {
    plugins {
        register("test_five_one") {
            id = "test_five"
            implementationClass = "Test5"
        }
    }
}

dependencies {
    /* Example Dependency */
    /* Depend on the android gradle plugin, since we want to access it in our plugin */
    implementation("com.android.tools.build:gradle:7.0.0")

    /* Example Dependency */
    /* Depend on the kotlin plugin, since we want to access it in our plugin */
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.50")

    /* Depend on the default Gradle API's since we want to build a custom plugin */
    implementation(gradleApi())
    implementation(localGroovy())
    implementation(kotlin("script-runtime"))
    implementation("org.jetbrains.kotlin:kotlin-scripting-jvm")
}