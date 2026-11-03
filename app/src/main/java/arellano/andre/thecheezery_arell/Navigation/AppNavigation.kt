package arellano.andre.thecheezery_arell.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import arellano.andre.thecheezery_arell.data.Category
import arellano.andre.thecheezery_arell.screen.ProductsScreen
import arellano.andre.thecheezery_arell.screens.*
import arellano.andre.thecheezery_arell.viewmodel.LoginViewModel
import arellano.andre.thecheezery_arell.viewmodel.ShopViewModel

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val shopViewModel: ShopViewModel = viewModel()
    val loginViewModel: LoginViewModel = viewModel()

    NavHost(navController = navController, startDestination = "welcome") {
        composable("welcome") { WelcomeScreen(onStartClick = { navController.navigate("login") }) }
        composable("login") {
            LoginScreen(loginViewModel.email, loginViewModel.password, loginViewModel.error,
                onEmailChange = loginViewModel::changeEmail,
                onPasswordChange = loginViewModel::changePassword,
                onLoginClick = { if (loginViewModel.login()) navController.navigate("menu") { popUpTo("welcome") { inclusive = true } } },
                onBackClick = { navController.popBackStack() })
        }
        composable("menu") {
            MenuScreen(onCategoryClick = { navController.navigate("products/${it.name}") },
                onCartClick = { navController.navigate("cart") })
        }
        composable("products/{category}") { entry ->
            val category = Category.entries.firstOrNull { it.name == entry.arguments?.getString("category") } ?: Category.HOT_DRINKS
            ProductsScreen(category.title, shopViewModel.productsOf(category), shopViewModel::isInCart,
                shopViewModel::addToCart, onBackClick = { navController.popBackStack() })
        }
        composable("cart") {
            CartScreen(shopViewModel.cart, shopViewModel.total, shopViewModel::removeFromCart,
                onBackClick = { navController.popBackStack() })
        }
    }
}
