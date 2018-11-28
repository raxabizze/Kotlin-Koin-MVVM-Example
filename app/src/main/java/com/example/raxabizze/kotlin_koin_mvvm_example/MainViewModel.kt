package com.example.raxabizze.kotlin_koin_mvvm_example

import android.arch.lifecycle.ViewModel
import android.util.Log

class MainViewModel(private val model: Model) : ViewModel() {

    fun getData() {
        Log.e("Message", model.getData())
    }
}
