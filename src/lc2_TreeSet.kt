

fun main(args:Array<String>){
    var setElement = setOf(1,2,50,22,29,30)
    for(element  in setElement){
        println(element)
    }

    print("this is mutable\n")
    var setMutable = mutableSetOf(88,2,12,102,12,1)
    setMutable.add(10)
    for (element in setMutable){
        println(element)
    }
}