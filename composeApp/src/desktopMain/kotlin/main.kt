import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "SampleForAllReproducers") {
        App()
    }
}

@Preview
@Composable
fun AppDesktopPreview() {
    App()
}