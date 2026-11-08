plugins {
    alias(libs.plugins.android.application)
    id("org.jetbrains.kotlin.plugin.serialization") version "1.8.10"

}

android {
    namespace = "com.example.a2026_ii_uso_retrofit"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.example.a2026_ii_uso_retrofit"
        minSdk = 28
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildFeatures{
        viewBinding = true
    }
}

dependencies {
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)

val retrofitVersion = "2.9.0"
// Retrofit
    implementation("com.squareup.retrofit2:retrofit:$retrofitVersion")
// Retrofit with Gson Converter
    implementation("com.squareup.retrofit2:converter-gson:$retrofitVersion")

// Kotlin serialization
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.1")

// Glide
    implementation("com.github.bumptech.glide:glide:5.0.9")


    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
}