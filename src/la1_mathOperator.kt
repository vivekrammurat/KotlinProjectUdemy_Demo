//math calculator

fun main(args:Array<String>){

    print("Enter the first Number :")
    var n1:Int = readLine()!!.toInt()

    print("Enter the Second Number :")
    var n2:Int = readLine()!!.toInt()

    var sum:Float?   //variable declearation
    sum = (n1 + n2).toFloat()
    print("Sum of two number is :"+sum)
}