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

// Definizione di un'enum class per rappresentare le schermate di navigazione
enum class NavigationScreen {
    FIRST,   // Prima schermata
    SECOND,  // Seconda schermata
    THIRD    // Terza schermata
}

// Funzione Composable per gestire la navigazione tra le schermate
@Composable
fun navigationApp(
    navController: NavHostController = rememberNavController()
) {
    // NavHost è un contenitore per le schermate navigabili
    NavHost(
        navController = navController,
        // Imposta la schermata di partenza
        startDestination = NavigationScreen.FIRST.name,
        modifier = Modifier
    ) {
        // Definizione della composable per la prima schermata
        composable(
            route = NavigationScreen.FIRST.name
        ) {
            FirstScreen(
                // Quando viene premuto il pulsante "Next", naviga alla seconda schermata
                onNextButtonClick = { navController.navigate(NavigationScreen.SECOND.name) },
                modifier = Modifier
            )
        }
        // Definizione della composable per la seconda schermata
        composable(
            route = NavigationScreen.SECOND.name
        ) {
            SecondScreen(
                // Quando viene premuto il pulsante "Next", naviga alla terza schermata
                onNextButtonClick = { navController.navigate(NavigationScreen.THIRD.name) },
                modifier = Modifier
            )
        }
        // Definizione della composable per la terza schermata
        composable(
            route = NavigationScreen.THIRD.name
        ) {
            ThirdScreen(
                // Quando viene premuto il pulsante "Next", naviga alla prima schermata (ciclo)
                onNextButtonClick = { navController.navigate(NavigationScreen.FIRST.name) },
                modifier = Modifier
            )
        }
    }
}
