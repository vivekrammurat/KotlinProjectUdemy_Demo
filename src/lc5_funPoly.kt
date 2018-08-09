
//Polymomrphisum
// having the function with same name ,same number of parameter with different datatypes


fun show(name : String){
    println("Name is : $name")
}

fun show(nameI : Int){
    println("nameI = $nameI")
}

fun show(nameD : Double ){
    println("nameD = $nameD")
}

fun main(args:Array<String>){
    show(10)
    show(50.2)
    show("Vivek Rammurat")

}