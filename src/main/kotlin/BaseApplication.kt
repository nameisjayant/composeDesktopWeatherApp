import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import weather_app.data.ui.CityViewModel

class BaseApplication : KoinComponent {

    val cityViewModel: CityViewModel by inject()
}