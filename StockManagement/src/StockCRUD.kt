import java.util.*
import kotlin.collections.ArrayList

class StockCRUD {
    var stocklist = ArrayList<Stock>()
    var sc = Scanner(System.`in`)
    fun addStock(){
        print("Enter Stock ID : ")
        var sid:Int = sc.nextInt()
        print("Enter Product Name : ")
        var sname: String = sc.next().toString()
        println("Enter Quantity : ")
        var sqty: Int = sc.nextInt()
        println("Enter Amount: ")
        var samt: Double = sc.nextDouble()
        var stotalamt: Double = samt*sqty
        var stockdata = Stock(sid,sname,sqty,samt,stotalamt)
        stocklist.add(stockdata)
        println("Stock with ID: "+sid+" is added successfully")
    }
    fun deleteStock(){
        println("Enter Stock ID for stock to be deleted")
        var del: Int = sc.nextInt()
        var chk = Stock(0, "d", 0, 0.0, 0.0)
        for(sitem in stocklist){
            chk=sitem
            if(sitem.getStockId() == del){
                stocklist.remove(sitem)
                println("Stock ID : "+del+" is removed")
                break;
            }
        }
        if(chk.getStockId() != del){
            println("Data not found")
        }
    }
    fun displayStock(){
        for(sitem in stocklist){
            println(sitem)
        }
    }
    fun updateStock(){
        print("Enter Stock ID to be updated: ")
        var sid: Int = sc.nextInt()
        var chk = Stock(0, "d", 0, 0.0, 0.0)
        for(sitem in stocklist){
            if(sitem.getStockId() == sid){
                chk = sitem
                stocklist.remove(sitem)
                print("Enter updated Product Name : ")
                var pname: String = sc.next().toString()
                print("Enter updated Quantity : ")
                var uqty: Int = sc.nextInt()
                print("Enter updated Amount:  ")
                var uamt: Double = sc.nextDouble()
                var utotalamt: Double = uqty*uamt;
                var update = Stock(sid,pname,uqty,uamt,utotalamt)
                stocklist.add(update)
                println("Stock ID : "+sid+" is successfully updated")
            }
        }
        if(chk.getStockId() != sid){
            println(" Data Not Found")
        }
    }
}