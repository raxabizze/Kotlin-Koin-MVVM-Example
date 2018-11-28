package com.example.raxabizze.kotlin_koin_mvvm_example

import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

object ApplicationModule {

    val applicationModule = module {

        single { Model() }

        viewModel { MainViewModel( get()) }
    }
}