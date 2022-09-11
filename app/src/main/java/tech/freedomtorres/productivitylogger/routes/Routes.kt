package tech.freedomtorres.productivitylogger.routes

sealed class Routes(val route: String) {
    object Login: Routes("Login")
}