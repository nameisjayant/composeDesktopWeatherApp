package di

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import network.ApiService
import org.koin.dsl.module
import weather_app.data.repository.CityRepository
import weather_app.data.ui.CityViewModel


val appModule = module {
    single { ApiService() }
    factory { CoroutineScope(SupervisorJob()) }
    factory { CityRepository(get()) }
    factory { CityViewModel(get(), get()) }
}