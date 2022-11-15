package structural.adapter.service

import structural.adapter.adapter.XMLPrediction

class GenerateCityWeatherReport (private val predictionAdapter: XMLPrediction) {

    fun execute(cityName: String): String {
        return predictionAdapter.getPredictionsByCity(cityName)
    }
}