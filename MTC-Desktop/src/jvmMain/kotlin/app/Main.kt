package app

import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import ui.main.App

fun main() = application {
    Window(
        resizable = false,
        state = WindowState(size = DpSize(1200.dp, 800.dp), position = WindowPosition(Alignment.Center)),
        title = "Balotario de preguntas MTC",
        onCloseRequest = ::exitApplication
    ) {
        App()
    }
}
