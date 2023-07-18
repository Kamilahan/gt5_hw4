package com.gt.gt5_cw2_lovecalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.gt.gt5_cw2_lovecalculator.databinding.ActivityMainBinding
import com.gt.gt5_cw2_lovecalculator.remote.LoveModel
import com.gt.gt5_cw2_lovecalculator.remote.RetrofitService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    //drgdfggdgdhtehshbdgb
    lateinit var binding:ActivityMainBinding

    val viewModel:LoveViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //fkdlgmkfrdjmvdjfmvbjf
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//fdgnhdbgterdfvgbhngytf
with(binding){
    btnGet.setOnClickListener {
     viewModel.getLiveData(etFname.text.toString(),etSname.text.toString())
         .observe(this@MainActivity,
             Observer {loveModel->
                 Log.e("ololo", "onCreate: $loveModel", )
         })

    }
}
    }
}