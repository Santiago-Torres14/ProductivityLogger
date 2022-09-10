package tech.freedomtorres.productivitylogger.routes

sealed class Routes(val value: String) {
    object Login: Routes("Login")
}