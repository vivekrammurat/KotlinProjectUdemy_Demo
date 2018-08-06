

fun main(args:Array<String>){
    var x:Int = readLine()!!.toInt()
    var y:Int = readLine()!!.toInt()

  // var temp = x
  y = x + y
  x = y - x
  y = y - x

    println(x)//20
    print(y)//10

}