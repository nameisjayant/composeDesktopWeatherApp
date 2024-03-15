import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import di.appModule
import features.data.ui.screens.mainScreen
import org.koin.core.context.startKoin


fun main() = application {
    startKoin {
        modules(appModule)
    }
    Window(onCloseRequest = ::exitApplication, resizable = false) {
        mainScreen()
    }
}
