package com.gt.gt5_cw2_lovecalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import com.gt.gt5_cw2_lovecalculator.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    //drgdfggdgdhtehshbdgb
    lateinit var binding:ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //fkdlgmkfrdjmvdjfmvbjf
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//fdgnhdbgterdfvgbhngytf
with(binding){
    btnGet.setOnClickListener {
        RetrofitService.api.getPercentage(etFname.text.toString(),etSname.text.toString())
            .enqueue(object : Callback<LoveModel> {
                override fun onResponse(call: Call<LoveModel>, response: Response<LoveModel>) {

                    val intent=Intent(this@MainActivity, ResultActivity::class.java)
                    intent.putExtra("result", response.body()?.result)
                   intent.putExtra("percentage", response.body()?.percentage)
                    startActivity(intent)



                 Log.e("ololo", "onResponse: ${response.body()}",)
                }

                override fun onFailure(call: Call<LoveModel>, t: Throwable) {
Log.e("ololo", "onFailure: ${t.message}")
                }

            })
    }
}
    }
}