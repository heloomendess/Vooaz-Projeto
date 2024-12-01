package com.vooazdomain.Vooaz.bottombar

import android.media.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector


data class BottomNavItem(
    val label: String,
    val icon: Int,
    val route:String,
    var size: Int,
)
