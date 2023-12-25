import java.util.Scanner
import kotlin.system.exitProcess

fun main(args: Array<String>){

    var sc = Scanner(System.`in`)
    var scrud = StockCRUD()
    while(true) {
        println("..........Stock Management System.........")
        println("1. Adding a Stock")
        println("2. Display all Stock(s)")
        println("3. Delete a Stock")
        println("4. Update a Stock")
        println("Exit the application")
        println("Choose your choice : ")
        var ch: Int = sc.nextInt();

        when (ch) {
            1 -> scrud.addStock()
            2 -> scrud.displayStock()
            3 -> scrud.deleteStock()
            4 -> scrud.updateStock()
            5 -> exitProcess(status = 1)
            else -> println("Invalid selection")
        }
    }

}