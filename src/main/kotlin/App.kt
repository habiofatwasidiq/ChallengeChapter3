import utils.IOUtils
import model.Player

class App {
    private val player = mutableListOf<Player>()

    private fun printHeader(){
        println("terminal:-terminal$")
        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")
    }
    private fun inputAndResult() {
        println("Masukan pemain 1 : ")
        val player1 = IOUtils.readString()

        println("Masukan pemain 2 : ")
        val player2 = IOUtils.readString()
        val status: Boolean
        player.add(Player(player1,player2))

        if (player2 != null) {
            if (player1.lowercase() == player2.lowercase()) {
                println("Hasil : ")
                println("DRAW!")
            } else if (player1.lowercase() == "batu") {
                if(player2.lowercase() == "gunting"){
                    status = true
                    result(status)
                }else{
                    status = false
                    result(status)
                }
            } else if (player1.lowercase() == "gunting") {
                if (player2.lowercase() == "kertas") {
                    status = true
                    result(status)
                } else {
                    status = false
                    result(status)
                }
            } else if (player1.lowercase() == "kertas") {
                if (player2.lowercase() == "batu") {
                    status = true
                    result(status)
                } else {
                    status = false
                    result(status)
                }
            }
        }
    }
    private fun result (status: Boolean, ) {

        println ("Hasil : ")
        if (status) {
            println("Pemain 1 Menang!")
        }
        else {
            println("Pemain 2 MENANG!")
        }
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