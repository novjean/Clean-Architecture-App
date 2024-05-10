package com.novatech.ldvmdb

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private var counter = MutableLiveData<Int>()

    // we can't change live data variable
    // and we need to have the get() method to access the value
    // this is used so that the mutable live data is not the value being accessed in the xml
    val countData: LiveData<Int>
    get() = counter

    init {
        counter.value = 0
    }

    fun updateCounter(){
        // increment the value of counter by 1
        counter.value = (counter.value)?.plus(1)
    }
}