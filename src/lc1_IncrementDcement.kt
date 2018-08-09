

fun main(args:Array<String>){
    var x : Int = 10
    var y : Int = 11

    var z = --x+y       //x=9(10 storing)
    var m = x++ + ++y   //x=9(10 storing)
    println("Value of x is$x")//x = 10

    println("Value of z is:$z" )//20
    print("Value of m is :$m")//21
}