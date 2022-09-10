package tech.freedomtorres.productivitylogger.screen

import androidx.compose.runtime.Composable
import tech.freedomtorres.productivitylogger.routes.Routes

@Composable
fun ScreenMain() {
    val navController = rememberNavController()

    NavHost(navCOntroller = navController, startDestination = Routes.Login.route) {
        composable(Routes.Login.route) {
            LoginPage(navController = navController)
        }
    }

}