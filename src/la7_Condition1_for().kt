
fun  main(args:Array<String>){
    for (count in 1..5){//this loop is run only 5 times
        println("Count1 :$count")

        for (count2 in 1..7) {//this neasted loops run 7 * 5 times
            print("\t Count2 :$count2  ")
        }

        print(" Loop nasted is done \n")
    }

    print("loop done")
}