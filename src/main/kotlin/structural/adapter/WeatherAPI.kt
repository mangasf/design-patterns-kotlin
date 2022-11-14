package structural.adapter

import org.json.JSONObject

class WeatherAPI {

    fun getWeatherByCity(cityName: String): String {

        val madridInfo = mutableMapOf(
            Pair("CityID", 12),
            Pair("WindSpeed", 30),
            Pair("WeatherState", "Cloudy"),
        )

        val barcelonaInfo = mutableMapOf(
            Pair("CityID", 13),
            Pair("WindSpeed", 12),
            Pair("WeatherState", "Sunny")
        )

        val cities = mutableMapOf(
            Pair("Madrid", madridInfo),
            Pair("Barcelona", barcelonaInfo)
        )

        return JSONObject(cities[cityName]).toString()
    }
}