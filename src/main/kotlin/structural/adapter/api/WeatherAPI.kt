package structural.adapter.api

import org.json.JSONObject
import structural.adapter.repository.PredictionRepository

class WeatherAPI: PredictionRepository {

    override
    fun getPredictionsByCity(cityName: String): JSONObject {

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

        return JSONObject(cities[cityName])
    }
}