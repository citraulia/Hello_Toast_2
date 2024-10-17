package com.example.hellotoast2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NameViewModel : ViewModel() {
    // Membuat LiveData dengan tipe Int
    val currentName: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }
}
