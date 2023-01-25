fun main() {
    val archives: MutableList<Archive> = mutableListOf()
    var screenManager: ScreenManager = ScreenManager()
    val screen: Screen = MainScreen("Список Архивов", archives, screenManager)



    screenManager.openScreen(screen)
    while (true) {
        val input = readLine()
        if (!input.isNullOrEmpty()) {
            screenManager.currentScreen?.execute(input)
        }
    }
}
