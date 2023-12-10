package com.example.assignement4testplace.ui.mississauga

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MississaugaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Mississauga"
    }
    val text: LiveData<String> = _text
}