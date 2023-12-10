package com.example.assignement4testplace.ui.brampton

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BramptonViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Brampton"
    }
    val text: LiveData<String> = _text
}