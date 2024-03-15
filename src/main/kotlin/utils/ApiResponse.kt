package utils

sealed class WeatherResponse<out T> {

    data class Success<T>(val data: T) : WeatherResponse<T>()
    data class Failure(val msg: String) : WeatherResponse<Nothing>()
    data object Loading : WeatherResponse<Nothing>()
    data object Empty : WeatherResponse<Nothing>()

}
