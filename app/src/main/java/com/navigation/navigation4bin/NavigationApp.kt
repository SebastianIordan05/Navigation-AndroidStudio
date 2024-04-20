package com.navigation.navigation4bin

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.navigation.navigation4bin.ui.theme.FirstScreen
import com.navigation.navigation4bin.ui.theme.SecondScreen
import com.navigation.navigation4bin.ui.theme.ThirdScreen

enum class NavigationScreen{
    FIRST,
    SECOND,
    THIRD
}

@Composable
fun navigationApp(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = NavigationScreen.FIRST.name,
        modifier = Modifier
    ) {
        composable(
            route = NavigationScreen.FIRST.name
        ) {
            FirstScreen(
                onNextButtonClick = { navController.navigate(NavigationScreen.SECOND.name) },
                modifier = Modifier
            )
        }
        composable(
            route = NavigationScreen.SECOND.name
        ) {
            SecondScreen(
                onNextButtonClick = { navController.navigate(NavigationScreen.THIRD.name) },
                modifier = Modifier
            )
        }
        composable(
            route = NavigationScreen.THIRD.name
        ) {
            ThirdScreen(
                onNextButtonClick = { navController.navigate(NavigationScreen.FIRST.name) },
                modifier = Modifier
            )
        }
    }
}