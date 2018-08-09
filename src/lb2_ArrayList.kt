

fun main(args:Array<String>){
    var list = ArrayList<String>()
    list.add("Vivek")
    list.add("Shubham")
    list.add("Rupesh")
    list.add("Anket")
    list.add("Rahul")

    //to print all the element in the list
    for (item in list){
        println(item)
    }

    list.set(0,"Vivek Rammurat") //to update the element in specified location
    println(list.get(0))



    if(list.contains("Rupesh"))  // to search the element in the ArrayList
        println("Matchs are found")
    else
        print("Try again...!")

    for(index in 0..list.size-1){//if size is 5 it give AIOBE
        println("List of element at location $index is: "+list[index])
    }
}