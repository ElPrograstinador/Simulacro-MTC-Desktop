package ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import utils.MenuItems

@Composable
fun NavigationMenu() {
    Column(
        modifier = Modifier.width(300.dp).background(Color(0xFFE6E3E2)).fillMaxHeight().padding(20.dp)
    ) {
        Image(painterResource("images/licensedriver.png"), contentDescription = "sample")
        NavigationTextFirstItem(MenuItems.LicenseType.value)
        NavigationTextItem(MenuItems.Subject.value)
        NavigationTextItem(MenuItems.Topic.value)
        NavigationTextItem(MenuItems.Question.value)
        NavigationTextItem(MenuItems.Alternatives.value)
    }
}