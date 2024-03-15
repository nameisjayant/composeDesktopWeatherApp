import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import features.data.ui.viewmodel.CityViewModel

class BaseApplication : KoinComponent {

    val cityViewModel: CityViewModel by inject()
}