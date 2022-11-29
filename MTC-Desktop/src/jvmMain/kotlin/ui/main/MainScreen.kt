package ui.main

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ui.components.NavigationMenu

@Composable
@Preview
fun App() {

    MaterialTheme {
        Row(modifier = Modifier.fillMaxSize()) {
            NavigationMenu()
            Column(modifier = Modifier.width(900.dp).fillMaxHeight()) {

            }
        }
    }
}


