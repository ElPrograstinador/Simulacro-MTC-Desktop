package ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NavigationMenu() {
    Column(
        modifier = Modifier.width(300.dp).background(Color(0xFFE6E3E2)).fillMaxHeight().padding(20.dp)
    ) {
        Image(painterResource("images/licensedriver.png"), contentDescription = "sample")
        Text("Tipo de licencia", fontSize = 20.sp, modifier = Modifier.padding(top = 20.dp))
        Text("Materia", fontSize = 20.sp, modifier = Modifier.padding(top = 28.dp))
        Text("Tema", fontSize = 20.sp, modifier = Modifier.padding(top = 28.dp))
        Text("Preguntas", fontSize = 20.sp, modifier = Modifier.padding(top = 28.dp))
        Text("Alternativas", fontSize = 20.sp, modifier = Modifier.padding(top = 28.dp))
    }
}