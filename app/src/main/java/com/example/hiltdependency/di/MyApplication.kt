package com.example.hiltdependency.di

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/*triggers Hilt's code generation, including a base class for your application
that serves as the application-level dependency container.*/
@HiltAndroidApp
class MyApplication: Application() {
}