package com.vooazdomain.Vooaz.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext





private val DarkColorScheme = darkColorScheme(
    primary = BlueGreen80,
    secondary = Green40,
    onSecondaryContainer = white,
    tertiary = Gray40,
    onTertiary = Yellow40,
    background= StrongBlue80,
    onBackground = Blue80,
    onSecondary = Black,

)

private val LightColorScheme = lightColorScheme(
    primary = BlueGreen80,
    secondary = Green40,
    onSecondaryContainer = white,
    tertiary = Gray40,
    onTertiary = Yellow40,
    background= StrongBlue80,
    onBackground = Blue80,
    onSecondary = Black,

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun VooazTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    var colors = if (darkTheme){
        DarkColorScheme
    } else {
        LightColorScheme
    }
    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        content = content
    )
}