package structural.adapter.service

import structural.adapter.adapter.XMLPredictionAdapter

class GenerateCityWeatherReport (private val predictionAdapter: XMLPredictionAdapter) {

    fun execute(cityName: String): String {
        return predictionAdapter.getPredictionsByCity(cityName);
    }
}