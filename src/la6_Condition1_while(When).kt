

fun main(args:Array<String>){
    var x:Int = 4

    when(x){
        1-> print("value is 1")
        2-> print("value is 2")
        3,4-> print("value is 3 or 4")  //this value is selected
        in 4..10-> print("value is below 10")
        in 10..20-> print("value is below 20")
        !in 20..30 -> print("value is not brtween 20 to 30")
        else ->{
            print("value is out of range")
        }
    }
}