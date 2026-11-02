package arellano.andre.thecheezery_arell.Navigation
import arellano.andre.thecheezery_arell.R

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import arellano.andre.thecheezery_arell.screen.ProductsScreen
import arellano.andre.thecheezery_arell.screen.WelcomeScreen
import arellano.andre.thecheezery_arell.screen.LoginScreen
import arellano.andre.thecheezery_arell.screen.MenuScreen
import arellano.andre.thecheezery_arell.screen.CartScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "welcome"
    ) {
        composable("welcome") {
            WelcomeScreen()
        }

        composable("login") {
            LoginScreen()
        }

        composable("menu") {
            MenuScreen()
        }

        composable("products") {
            ProductsScreen()
        }

        composable("cart") {
            CartScreen()
        }
    }
}
