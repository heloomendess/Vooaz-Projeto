package com.vooazdomain.Vooaz.bottombar

import com.vooazdomain.Vooaz.R
object ConstantsBottomNavItem {
    val BottomNavItems = listOf(
        BottomNavItem(
            label = "Chat",
            icon = R.drawable.chatbubble,
            route = "test/AirPlane",
            size = 32
        ),
        BottomNavItem(
            label = "Destination",
            icon = R.drawable.destinationicon,
            route = "test/Chat",
            size = 32

        ),
        BottomNavItem(
            label = "Airplane",
            icon = R.drawable.airplaneicon,
            route = "test/AirPlane",
            size = 32

        ),
        BottomNavItem(
            label = "Tour guides",
            icon = R.drawable.tourguides,
            route = "test/Tour guides",
            size = 32

        ),
        BottomNavItem(
            label = "Settings",
            icon = R.drawable.settingsicon,
            route = "test/Settings",
            size = 26

        ),
    )
}
