package structural.adapter.repository

import org.json.JSONObject

interface PredictionRepository {

    fun getPredictionsByCity(cityName: String): JSONObject
}