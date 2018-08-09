
fun main(args:Array<String>){
    var map = hashMapOf(1 to "vivek",2 to "shubham")
    map.put(3,"kavita")
    for (index in 1..map.size){
        println("Map index is $index : ${map[index]}")
    }
}