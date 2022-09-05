class App {

    private fun printHeader(){
        println("terminal:-terminal$")
        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")
    }

    fun run () {
        printHeader()

    }

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val app = App()
            app.run()

        }
    }


}