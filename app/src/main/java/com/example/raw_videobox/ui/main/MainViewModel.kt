package com.example.raw_videobox.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.raw_videobox.model.Appstate
import com.example.raw_videobox.model.repository.Repository
import com.example.raw_videobox.model.repository.RepositoryImpl
import java.lang.Thread.sleep


class MainViewModel(private val repository: Repository = RepositoryImpl()
) :
    ViewModel() {
    private val liveDataToObserve: MutableLiveData<Appstate> =
        MutableLiveData()
        fun getData(): LiveData<Appstate>{
            getDataFromLocalSource()
            return liveDataToObserve
        }

    private fun getDataFromLocalSource(){
        val rand = (0..1).random()
        liveDataToObserve.value = Appstate.Loading
        Thread{
            sleep(1000)
            if(rand == 0){
               liveDataToObserve.postValue(Appstate.Success(repository.getMovieFromLocal()))
            }
            else{
                liveDataToObserve.postValue(Appstate.Error())
            }
        }.start()
    }
}