package com.novatech.ldvmdb

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    var counter = MutableLiveData<Int>()

    init {
        counter.value = 0
    }

    fun updateCounter(){
        // increment the value of counter by 1
        counter.value = (counter.value)?.plus(1)
    }
}