
fun main(args:Array<String>){
    var n1 : Int = 10
    var n2 : Int?
    var n2Str:String="12"
    var n3Float:Float?

    n2 = n2Str.toInt()
    n3Float = n2Str.toFloat()
    println("n1  :"+n1)
    println("n2  :"+n2)
    println("n3 : "+n3Float)

    var n4 : Double?
    n4 = 3.14245

    println("n4  :"+n4.toInt())//it convert Only one ways that is int = int
}