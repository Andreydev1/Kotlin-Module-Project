import java.lang.NumberFormatException

class ArchiveScreen(
    ScreenName: String,
    archive: Archive,
    val screenManager: ScreenManager,
    val archiveList: MutableList<Archive>
) : Screen(ScreenName) {
    var archive = archive
    override fun openScreen() {
        println("Текущий архив:${archive.ArchiveName}")
        println("0.Создать заметку")
        var noteIndex: Int = 0
        for (i in archive.notes) {
            println("${++noteIndex} ${i.noteName}")

        }


        println("${archive.notes.size + 1}.Назад")


    }

    override fun execute(input: String) {
        var menuIndex: Int
        try {
            menuIndex = input.toInt()
        } catch (e: NumberFormatException) {
            println("Ошибка введите корректные данные")
            return
        }

        when (menuIndex) {
            0 -> screenManager.openScreen(
                CreateNoteScreen(
                    "Введите название заметки",
                    screenManager,
                    archive,
                    archiveList
                )
            )

            archive.notes.size + 1 -> screenManager.openScreen(MainScreen("Мои Архивы", archiveList, screenManager))
            in 1..archive.notes.size -> screenManager.openScreen(
                NoteScreen(
                    "Введите текст заметки", archive.notes[menuIndex - 1], screenManager, archive, archiveList
                )
            )

        }

    }
}


