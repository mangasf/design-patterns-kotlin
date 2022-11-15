package structural.adapter.adapter

import org.json.XML
import structural.adapter.repository.PredictionRepository

class XMLPredictionAdapter (private val predictionRepository: PredictionRepository): XMLPrediction {

    override fun getPredictionsByCity(cityName: String): String {

        val cityPrediction = predictionRepository.getPredictionsByCity(cityName)

        return XML.toString(cityPrediction)
    }
}