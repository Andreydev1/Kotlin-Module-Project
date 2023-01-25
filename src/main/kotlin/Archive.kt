class Archive(var ArchiveName: String) {
    val notes: MutableList<Note> = mutableListOf()
    override fun toString(): String {
        return ArchiveName
    }

}
