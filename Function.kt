//fun printName(name:String){
//        println("My name is $name ")
//    }
//
//fun main(){
//    printName("Newton")
//}

// functions
// functioon -  definition and a body

//val name: String = "Newton"
//fun printName(){
//    println("My name is $name")
//}
//
//fun main() {
//    printName()
//}

//Functions with Parameters

//fun addNumbers(a:Int, b:Int ):Int{ //parameters
//    var c:Int = a + b
////    println("The sum of $a and $b is $c")
//    return c
//}
//
//fun main(){
//    println(addNumbers(20, 12))//arguments
//}

//write me a function that returns the quotient of two numbers, and if the number is divided by zero it prints "Mathematical error"
//fun divideNumbers(a:Double, b:Double){
//    if(b > 0){
//        var c:Double = a/b
//        println("$a divided by $b is $c")
//    }else{
//        println("Mathematical error")
//    }
//
//}

fun divideNumbers(a:Double, b:Double) = if(b > 0){ println("The quotient of $a divided by $b is $")}else{println("Mathematical error")}



fun main() {
    divideNumbers(20.4, 0.0)
}

// create a method that takes in parameters, name (String) and pin (int),
// if the name and pins are correct, it prints "you can log in"



