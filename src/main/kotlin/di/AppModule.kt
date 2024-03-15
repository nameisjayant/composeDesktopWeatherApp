package di

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import data.network.ApiService
import org.koin.dsl.module
import data.repository.CityRepository
import features.data.ui.viewmodel.CityViewModel


val appModule = module {
    single { ApiService() }
    factory { CoroutineScope(SupervisorJob()) }
    factory { CityRepository(get()) }
    factory { CityViewModel(get(), get()) }
}