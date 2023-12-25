class Stock (var stockid:Int, var productname:String, var quantity:Int, var amount:Double, var totalamount:Double )
{
   fun getStockId(): Int{
       return stockid;
   }
    fun setStockId(id:Int){
        stockid = id;
    }
    fun getProductName(): String{
        return productname;
    }
    fun setProductName(name: String){
        productname = name;
    }
    fun getStockQty(): Int{
        return quantity;
    }
    fun setStockQty(qty: Int){
        quantity = qty;
    }
    fun getStockAmount(): Double{
        return amount;
    }
    fun setStockAmount(amt:Double){
        amount = amt;
    }

    override fun toString(): String {
        return "Stock ID:"+stockid+"\tName: "+productname+"\tQty: "+quantity+"\tAmount: "+amount+"\tTotal: "+totalamount
    }
}