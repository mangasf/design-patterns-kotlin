package structural.adapter.service

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import structural.adapter.adapter.XMLPrediction
import structural.adapter.adapter.XMLPredictionAdapter
import structural.adapter.api.WeatherAPI
import structural.adapter.repository.PredictionRepository

internal class AdapterTest {

    private var predictionRepository: PredictionRepository = WeatherAPI()
    private var xmlPrediction: XMLPrediction = XMLPredictionAdapter(predictionRepository)

    private var generateCityWeatherReportService: GenerateCityWeatherReport = GenerateCityWeatherReport(xmlPrediction)
    private var getCityWeather: GetCityWeather = GetCityWeather(predictionRepository)

    @Test
    fun `should generate a prediction report on XML format`() {

        val prediction = generateCityWeatherReportService.execute("Madrid")
        val expected = "<CityID>12</CityID><WindSpeed>30</WindSpeed><WeatherState>Cloudy</WeatherState>"

        assertEquals(expected, prediction)
    }

    @Test
    fun `should get a city prediction on JSON format`() {

        val prediction = getCityWeather.execute("Madrid")
        val expected = "{\"CityID\":12,\"WindSpeed\":30,\"WeatherState\":\"Cloudy\"}"

        assertEquals(expected, prediction.toString())
    }
}