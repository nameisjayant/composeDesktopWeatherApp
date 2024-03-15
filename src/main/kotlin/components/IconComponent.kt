package components

import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource


@Composable
fun iconComponent(
    modifier: Modifier = Modifier,
    icon: String? = null,
    imageVector: ImageVector? = null,
    tint: Color = Color.Unspecified
) {
    icon?.let {
        Icon(painter = painterResource(it), contentDescription = null, modifier = modifier, tint = tint)
    }
    imageVector?.let {
        Icon(imageVector = it, contentDescription = null, modifier = modifier, tint = tint)
    }

}