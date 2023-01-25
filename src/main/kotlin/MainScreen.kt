import java.lang.NumberFormatException
import kotlin.system.exitProcess

class MainScreen(ScreenName: String, var archiveList: MutableList<Archive>, val screenManager: ScreenManager) :
    Screen(ScreenName) {

    override fun openScreen() {
        super.openScreen()
        println("0.Создать архив")
        var ArchiveIndex: Int = 0
        for (i in archiveList) {
            println("${++ArchiveIndex}.${i.ArchiveName}")

        }
        println("Для выхода из приложения нажмите ${ArchiveIndex + 1}.")

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
            0 -> screenManager.openScreen(CreateArchiveScreen("Введите имя архива:", archiveList, screenManager))
            archiveList.size + 1 -> exitProcess(1)
            in 1..archiveList.size -> screenManager.openScreen(
                ArchiveScreen(
                    "Архив.",
                    archiveList[menuIndex - 1],
                    screenManager,
                    archiveList
                )
            )
        }

    }
}


