package com.example.assignement4testplace.ui.oakville

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OakvilleViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Oakville"
    }
    val text: LiveData<String> = _text
}