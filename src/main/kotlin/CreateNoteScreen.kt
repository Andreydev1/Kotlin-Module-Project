class CreateNoteScreen(
    screen: String,
    val screenManager: ScreenManager,
    val archive: Archive,
    val archiveList: MutableList<Archive>
) : Screen(screen) {


    override fun execute(input: String) {
        archive.notes.add(Note(input))
        screenManager.openScreen(ArchiveScreen(archive.ArchiveName, archive, screenManager, archiveList))
    }

    override fun openScreen() {
        super.openScreen()
    }
}

