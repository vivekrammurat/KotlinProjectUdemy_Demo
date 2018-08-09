


fun main(agrgs:Array<String>){
    var arrayInt = Array<Int>(5){0}
    arrayInt[2] = 55
    println("arrayInt[3] : ${arrayInt[3]}")

    println("Array element")
    for (element in arrayInt){
        println(element)
    }

    // this is index based search
    for(index in 0..4){
        println(arrayInt[index])
    }

    var arrayStr = Array<String>(4){""}

    for (index in 0..3){
        print("Enter the string at $index")
        arrayStr[index] = readLine()!!
    }

    for (index in 0..3){
        println("You Entered : at[$index]"+ arrayStr[index])
    }
}