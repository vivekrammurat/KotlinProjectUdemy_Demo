

fun main(agrs:Array<String>){
    var n1 = 10
    var n2 = 20
    var max:Int?


    max = if(n1> n2) n1 else n2
    println("Maximum is   : $max")

    var IsYoung:Boolean = when(n2) {
            20-> true
        else->false

    }
    print("IsYoung : $IsYoung")
}