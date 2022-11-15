package structural.adapter.service

import org.json.JSONObject
import structural.adapter.repository.PredictionRepository

class GetCityWeather(private val predictionRepository: PredictionRepository) {

    fun execute(cityName: String): JSONObject {
        return predictionRepository.getPredictionsByCity(cityName)
    }
}