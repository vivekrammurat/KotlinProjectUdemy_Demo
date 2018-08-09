

fun sum(i:Int,j:Int):Int{
    return i  + j
}

fun sum(n1 :Int, n2 :Int , n3 :Int):Int{
    return n1 + n2 + n3
}


fun sum(n1 :Int, n2 :Int , n3 :Int,n4:Int):Int{
    return n1 + n2 + n3 +n4
}
fun main(args:Array<String>){
    var numOfNum : Int ?
    numOfNum = sum(10,20)
    println("The sum of Number is :$numOfNum")

    numOfNum = sum(20,30,40)
    println("The sum of Number is :$numOfNum")

    numOfNum = sum(10,2,10,40)
    println("The sum of Number is :$numOfNum")

    //note if the function is overloaded than signature of the method is different
    // and name of method is same

}