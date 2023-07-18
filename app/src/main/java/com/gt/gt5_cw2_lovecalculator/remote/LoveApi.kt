package com.gt.gt5_cw2_lovecalculator.remote

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface LoveApi {


    @GET("getPercentage")
    fun getPercentage(
    @Query("fname") firstName:String,
    @Query("sname") secondName:String,
    @Header("X-RapidAPI-Key") key:String="88198c3bc6msh2e8023827faccf6p19d7e1jsn0e0e6763b0e4",
    @Header("X-RapidAPI-Host") host:String="love-calculator.p.rapidapi.com"
    ): Call<LoveModel>
}

//https://love-calculator.p.rapidapi.com/getPercentage?sname=Alice&fname=John
// 	.addHeader("X-RapidAPI-Key", "88198c3bc6msh2e8023827faccf6p19d7e1jsn0e0e6763b0e4")
//	.addHeader("X-RapidAPI-Host", "love-calculator.p.rapidapi.com")