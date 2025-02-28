plugins {
    id("java")
}

group = "org.TD"
version = "1.0-SNAPSHOT"

val gdxVersion = "1.11.0"
val aiVersion = "1.8.2"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation ("com.badlogicgames.gdx:gdx:${gdxVersion}")
    implementation ("com.badlogicgames.gdx:gdx-box2d:${gdxVersion}") // (Optional) Box2D physics library
    implementation ("com.badlogicgames.gdx:gdx-ai:${aiVersion}") // (Optional) AI library

    // Platform-specific dependencies
    implementation ("com.badlogicgames.gdx:gdx-backend-lwjgl3:${gdxVersion}") // Desktop (LWJGL3)
    implementation ("com.badlogicgames.gdx:gdx-platform:${gdxVersion}:natives-desktop")

    implementation ("com.badlogicgames.gdx:gdx-backend-android:${gdxVersion}") // Android
    implementation ("com.badlogicgames.gdx:gdx-platform:${gdxVersion}:natives-armeabi-v7a")
    implementation ("com.badlogicgames.gdx:gdx-platform:${gdxVersion}:natives-arm64-v8a")
    implementation ("com.badlogicgames.gdx:gdx-platform:${gdxVersion}:natives-x86")

    implementation ("com.badlogicgames.gdx:gdx-backend-ios:${gdxVersion}") // iOS
    implementation ("com.badlogicgames.gdx:gdx-platform:${gdxVersion}:natives-ios")

    // implementation ("com.badlogicgames.gdx:gdx-backend-gwt:${gdxVersion}") // HTML5 (GWT)

}


tasks.test {
    useJUnitPlatform()
}