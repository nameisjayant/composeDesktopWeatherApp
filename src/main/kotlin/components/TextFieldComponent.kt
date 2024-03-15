package components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import ui.primary
import ui.secondary
import utils.onValueChange


@Composable
fun searchTextFieldComponent(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: onValueChange,
    placeholder: String,
    leadingIcon: @Composable () -> Unit
) {
    BasicTextField(
        value = value,
        onValueChange = onValueChange,
        singleLine = true,
        maxLines = 1,
        modifier = modifier.fillMaxWidth(0.7f),
        textStyle = MaterialTheme.typography.body2.copy(
            color = Color.White
        )
    ) {
        Row(
            modifier = Modifier.background(primary, CircleShape).padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            leadingIcon()
            spacerWidth()
            Box {
                if (value.isEmpty())
                    Text(
                        placeholder, style = MaterialTheme.typography.caption.copy(
                            color = secondary,
                            fontWeight = FontWeight.W200
                        )
                    )
                it.invoke()
            }
        }
    }
}