class ScreenManager() {
    var currentScreen: Screen? = null
    fun openScreen(screen: Screen) {
        currentScreen = screen
        currentScreen!!.openScreen()
    }
}