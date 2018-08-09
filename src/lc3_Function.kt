

import org.omg.CORBA.INTERNAL

fun sum(n1:Double, n2:Double):Double{
    var add = n1 + n2
    return add
}


fun main(args:Array<String>){
    var r = sum(10.0,20.0)
    println("Value of is r  :$r")

    display(5)
    display()//if the function is called without paramenter then
    println("The vale of ${sum(100.0,200.12)}")
    println("Find the LCM of ${m1(18,729)}")

    dispalyNoInput()
}

fun display(i: Int = 0) {//the assign value to local variable is called
    println("This is the Value of i:" + i)

}


fun dispalyNoInput():Unit{
    println("Welcome to diaplay")
}

fun m1(n1:Int,n2:Int){
    for(i in 2..9){
        if(n1%i==0 && n2%i == 0){
            println("LCM of number is : $i")
            continue
        }


    }


}