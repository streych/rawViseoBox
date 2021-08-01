package com.example.raw_videobox.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MainViewModel : ViewModel() {

    private  val liveDataToObserve: MutableLiveData<Any> = MutableLiveData()
    fun getLiveData() = liveDataToObserve


}