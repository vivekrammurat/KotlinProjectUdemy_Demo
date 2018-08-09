

fun main(args:Array<String>){
    print("Enter your Grade :")
    var grade = readLine()!!.toDouble()

    if (grade >= 90)
        print("Your grade is : A ")
    else if(grade >= 60)
        print("Your grade is : B")
    else if(grade >= 45)
        print("Your grade is : C")
    else
        print("Fail")


    print("\nYour grade is : $grade")
}