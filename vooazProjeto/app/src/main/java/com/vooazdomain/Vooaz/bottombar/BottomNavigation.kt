import android.provider.SyncStateContract.Constants
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.vooazdomain.Vooaz.bottombar.ConstantsBottomNavItem


@Composable
fun  navegationBar(navController: NavHostController) {

    var selectedIndex by remember { mutableStateOf(0) }
    var someThemes = MaterialTheme.colorScheme
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(
                color = someThemes.onBackground,
                shape = RoundedCornerShape(topStart = 55.dp, topEnd = 55.dp)
            ).padding(10.dp)
    ) {

        Row (
            modifier = Modifier
                .align(Alignment.Center)
                .fillMaxSize()
                .padding(horizontal = 1.dp),
            horizontalArrangement = Arrangement.SpaceEvenly

        ) {
            ConstantsBottomNavItem.BottomNavItems.forEachIndexed { index, bottomNavItem ->

                Box(
                    modifier = Modifier
                        .clickable(
                            indication = null, // Remove o efeito de ripple (sombra de clique)
                            interactionSource = remember { MutableInteractionSource() } // Remove o efeito de interação

                        ) {


                            selectedIndex = index

                            navController.navigate(bottomNavItem.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                restoreState = true
                            }
                        }
                        .fillMaxHeight().width(70.dp),
                    contentAlignment = Alignment.Center
                ) {


                        if (selectedIndex == index) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.spacedBy(8.dp),
                                modifier = Modifier.fillMaxHeight().padding(top= 9.dp)
                            ) {
                                // Ícone
                                Image(
                                    painter = painterResource(id = bottomNavItem.icon),
                                    contentDescription = bottomNavItem.label,
                                    modifier = Modifier.size(bottomNavItem.size.dp).shadow(elevation = 15.dp),
                                )
                            Box(
                                modifier = Modifier
                                    .width(30.dp)
                                    .height(4.dp)
                                    .background(someThemes.onSecondaryContainer)
                                    .padding(top = 7.dp)
                            )
                            }} else {

                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier.fillMaxHeight()
                            ) {
                                // Ícone
                                Image(
                                    painter = painterResource(id = bottomNavItem.icon),
                                    contentDescription = bottomNavItem.label,
                                    modifier = Modifier.size(bottomNavItem.size.dp),
                                )
                            Text(
                                text = bottomNavItem.label,
                                fontSize = 10.sp,
                                color = someThemes.onSecondaryContainer,
                                modifier = Modifier.padding(top = 4.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}
@Composable
@Preview( showBackground = true, widthDp = 200, heightDp = 600)
fun PreviewNavigationBar(){
    navegationBar(rememberNavController())
}