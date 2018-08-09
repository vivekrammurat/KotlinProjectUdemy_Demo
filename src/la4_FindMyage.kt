import java.util.*
/*

this is my favourite program

 */


fun main(args:Array<String>){

    print("Enter Your DOB year:")
    var DOB : Int = readLine()!!.toInt()
    var year = Calendar.getInstance().get(Calendar.YEAR)

    var age : Int = year - DOB


    print("your age is :$age years")
}