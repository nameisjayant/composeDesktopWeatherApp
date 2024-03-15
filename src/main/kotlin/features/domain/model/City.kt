package features.domain.model

data class City(
    val name:String? = null,
    val main: Main? = null,
    val visibility:String?=null,
    val weather:List<Weather>?=null
)
data class Weather(
    val description:String?=null
)

data class Main (
    val temp_max:String?= null,
    val temp_min:String?=null,
    val pressure:String?=null,
    val humidity:String?=null,

    )
