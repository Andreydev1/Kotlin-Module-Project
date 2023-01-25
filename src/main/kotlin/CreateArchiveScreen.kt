class CreateArchiveScreen(screen: String, archiveList: MutableList<Archive>, val screenManager: ScreenManager) :
    Screen(screen) {
    val archive: MutableList<Archive> = archiveList
    override fun execute(input: String) {
        val archive1: Archive = Archive(input)
        archive.add(archive1)
        screenManager.openScreen(MainScreen("Архив успешно создан!", archive, screenManager))
    }

    override fun openScreen() {
        super.openScreen()


    }
}