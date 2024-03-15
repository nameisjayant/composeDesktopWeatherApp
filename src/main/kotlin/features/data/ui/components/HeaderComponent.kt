package features.data.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import components.iconComponent
import components.searchTextFieldComponent
import components.spacerWidth
import ui.lightBlue
import ui.primary
import utils.onValueChange


@Composable
fun headerComponent(
    modifier: Modifier = Modifier,
    currentLocation: String = "New Delhi,India",
    value: String,
    onValueChange: onValueChange
) {
    Row(
        modifier = modifier
    ) {
        Row(
            modifier = Modifier.weight(1f)
        ) {
            Row(
                modifier = Modifier.align(Alignment.CenterVertically)
            ) {
                iconComponent(icon = "location.png", modifier = Modifier.size(16.dp))
                spacerWidth(5.dp)
                Text(
                    currentLocation, style = MaterialTheme.typography.body2.copy(
                        color = Color.White, fontWeight = FontWeight.Normal
                    )
                )
            }
            spacerWidth(50.dp)
            searchTextFieldComponent(value = value,
                onValueChange = onValueChange,
                placeholder = "Search city...",
                leadingIcon = {
                    iconComponent(icon = "search.png", tint = Color.White, modifier = Modifier.size(16.dp))
                })
        }
        Spacer(modifier = Modifier.background(lightBlue, CircleShape).size(35.dp))
    }
}