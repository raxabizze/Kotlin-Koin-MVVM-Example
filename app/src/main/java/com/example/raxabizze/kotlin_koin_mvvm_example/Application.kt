package com.example.raxabizze.kotlin_koin_mvvm_example

import android.app.Application
import org.koin.android.ext.android.startKoin

class Application : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin(this, listOf(ApplicationModule.applicationModule) )
    }
 }