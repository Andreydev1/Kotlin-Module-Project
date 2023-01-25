class Note(var noteName: String) {
    var NoteText: String = ""
    fun addNoteText(text: String) {
        NoteText = text
    }

    override fun toString(): String {
        return noteName
    }
}