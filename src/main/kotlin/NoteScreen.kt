class NoteScreen(
    ScreenName: String,
    note: Note,
    val screenManager: ScreenManager,
    val archive: Archive,
    val archiveList: MutableList<Archive>
) : Screen(ScreenName) {
    var note: Note = note
    override fun openScreen() {
        println("Ваша заметка с именем ${note.noteName}\nСодержит: ${note.NoteText}")
        super.openScreen()

        println("После заполнения/изменения заметки нажмите \"0\".")
        println("0.Назад")

    }


    override fun execute(input: String) {
        if (input == "0") screenManager.openScreen(ArchiveScreen("Архив", archive, screenManager, archiveList))
        else note.addNoteText(input)

    }
}


