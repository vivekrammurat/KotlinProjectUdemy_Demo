
fun main(args:Array<String>){
    val age  = 21
    val dep:String?
    dep = "Software Engineering"

    println("Please Enter your Name :")
    var name = readLine()


    println("Name "+name)
    println("Age "+ age)
    println("Department :"+dep)

    print("Please Enter The Pi  :")
    var pi:Double = readLine()!!.toDouble()
    print("Value of pi : "+pi)

}