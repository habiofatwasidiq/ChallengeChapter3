class App {

    private fun printHeader(){
        println("terminal:-terminal$")
        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")
    }
    private fun inputAndResult() {

    }

    fun run () {
        printHeader()
        inputAndResult()

    }

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val app = App()
            app.run()

        }
    }


}