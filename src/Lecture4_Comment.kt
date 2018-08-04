

fun main(args:Array<String>){

    print("Please Enter your Name : ")
    val name = readLine()  //val is final variable

    print("Enter you age :")
    val age:Int = readLine()!!.toInt()

    print("Enter Department :")
    var dept = readLine()  /* this is varible you can assign it any time */


    //this is an Output
    println("Name : "+name)
    println("Your age is :\t"+age)
    println("Department is :\t"+dept)


}