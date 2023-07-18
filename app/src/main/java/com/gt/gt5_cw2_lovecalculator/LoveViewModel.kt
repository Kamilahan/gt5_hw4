package com.gt.gt5_cw2_lovecalculator

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.gt.gt5_cw2_lovecalculator.remote.LoveModel

class LoveViewModel : ViewModel(){
    var repository= Repository()

    fun getLiveData(firstName:String,secondNAme:String):LiveData<LoveModel>{
        return repository.getData(firstName,secondNAme)
    }
}