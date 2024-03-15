package data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import data.network.ApiService
import features.domain.model.City

class CityRepository(private val apiService: ApiService) {

    fun getCurrentWeather():Flow<City> = flow {
        emit(apiService.getCurrentWeather())
    }
}