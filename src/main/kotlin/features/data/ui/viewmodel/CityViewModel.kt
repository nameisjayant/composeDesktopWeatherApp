package features.data.ui.viewmodel

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import utils.WeatherResponse
import features.domain.model.City
import data.repository.CityRepository

class CityViewModel (
    private val cityRepository: CityRepository,
    private val scope: CoroutineScope
) {

    private val _cityResponse: MutableStateFlow<WeatherResponse<City>> = MutableStateFlow(WeatherResponse.Empty)
    val cityResponse = _cityResponse.asStateFlow()

    init {
        getCurrentWeather()
    }

    private fun getCurrentWeather() = scope.launch {
        cityRepository.getCurrentWeather()
            .onStart {
                _cityResponse.value = WeatherResponse.Loading
            }.catch { e ->
                _cityResponse.value = WeatherResponse.Failure(e.toString())
            }.collect {
                _cityResponse.value = WeatherResponse.Success(it)
            }
    }
}