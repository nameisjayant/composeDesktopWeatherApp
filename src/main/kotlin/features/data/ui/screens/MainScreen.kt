package features.data.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import features.data.ui.components.headerComponent
import ui.backgroundColor

@Composable
fun mainScreen() {
    var search by remember { mutableStateOf("") }
    mainComponent(
        header = {
            headerComponent(value = search, onValueChange = {
                search = it
            })
        }
    )
}

@Composable
fun mainComponent(
    modifier: Modifier = Modifier,
    header: @Composable () -> Unit
) {
    LazyColumn(
        modifier = modifier.background(backgroundColor).fillMaxSize(),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 24.dp)
    ) {
        item {
            header()
        }
    }
}