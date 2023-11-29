package com.example.weatherapp.networking.weatherApi

import com.example.weatherapp.model.CurrentWeatherResponse
import com.example.weatherapp.model.WeatherForecastResponse
import retrofit2.Call
import retrofit2.http.*


interface WeatherApiService {
    @GET("current.json")
    fun getCurrentWeather(
        @Query("key") key: String = WeatherApiConfig.API_KEY,
        @Query("q") city: String,
        @Query("aqi") aqi: String = "no",
        @Query("alerts") alerts: String = "no",
        @Query("lang") lang: String = "nl"
    ): Call<CurrentWeatherResponse>

    @GET("forecast.json")
    fun getWeatherForecast(
        @Query("key") key: String = WeatherApiConfig.API_KEY,
        @Query("q") location: String,
        @Query("aqi") aqi: String = "no",
        @Query("alerts") alerts: String = "no",
        @Query("lang") lang: String = "nl",
        @Query("days") days: Int
    ): Call<WeatherForecastResponse>
}