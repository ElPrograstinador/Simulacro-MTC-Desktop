package ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NavigationTextFirstItem(title: String) = Text(text = title, fontSize = 20.sp, modifier = Modifier.padding(top = 20.dp))

@Composable
fun NavigationTextItem(title: String) = Text(text = title, fontSize = 20.sp, modifier = Modifier.padding(top = 32.dp))

