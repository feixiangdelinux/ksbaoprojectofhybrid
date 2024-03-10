plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
//    id("com.google.devtools.ksp") version "1.5.10-1.0.0-beta01"
//    id("com.google.devtools.ksp") version "1.8.10-1.0.9" apply false
}

android {
    namespace = "com.beiyan.ksbao"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.beiyan.ksbao"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(project(":library"))
    implementation(project(":Aliyunplayerlibrary"))
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation("com.blankj:utilcodex:1.30.5")
    implementation("com.lzy.net:okgo:3.0.4")
    implementation("com.jakewharton.timber:timber:4.7.1")
    implementation("androidx.recyclerview:recyclerview:1.1.0")
    implementation("com.github.CymChad:BaseRecyclerViewAdapterHelper:3.0.4")
    implementation("com.github.bumptech.glide:glide:4.11.0")
//    kapt("com.github.bumptech.glide:compiler:4.11.0")
    implementation("com.aliyun.dpa:oss-android-sdk:2.9.11")
    implementation("com.squareup.picasso:picasso:2.5.2")
    implementation("com.qiyukf.unicorn:unicorn:7.7.1")
//    implementation("com.sunchen:netstatusbus:0.1.5")
    implementation("io.objectbox:objectbox-kotlin:2.9.0")
    implementation("io.objectbox:objectbox-rxjava:2.3.4")
//    kapt("io.objectbox:objectbox-processor:2.9.0")
    implementation("com.squareup.retrofit2:retrofit:2.7.2")
    implementation("com.squareup.retrofit2:converter-gson:2.7.2")
    implementation("com.squareup.retrofit2:adapter-rxjava2:2.7.2")
    implementation("org.greenrobot:eventbus:3.1.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0")
    implementation("com.github.yyued:SVGAPlayer-Android:2.5.14")
    implementation("com.jakewharton.rxbinding3:rxbinding:3.1.0")
    implementation("io.github.lucksiege:pictureselector:v3.10.7")
    implementation("io.github.lucksiege:compress:v3.10.7")
    implementation("io.github.lucksiege:ucrop:v3.10.7")
    implementation("io.github.lucksiege:camerax:v3.10.7")


}