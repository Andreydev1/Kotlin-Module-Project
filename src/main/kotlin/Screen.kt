abstract class Screen(var ScreenName: String) {
  open fun openScreen(){
    println("$ScreenName")
  }
  abstract fun execute(input: String)
}