import kotlin.properties.Delegates

open class Fruits {

    var fColor:String = "yellow"
    var fSeeds:Int = 20

    fun changeColor(newColor: String){
        fColor = newColor
    }



}

//fun main() {
//    var orange = Fruits()
//    println("The color of the orange is "+orange.fColor)
//    println("The number of seeds is "+orange.fSeeds)
//    var mango = Fruits()
//    println("The initial color of the mango is " +mango.fColor )
//    mango.changeColor("red")
//    println("The new color of the mango is "+mango.fColor)
//
//}

//Problem: Managing Library Books
//
//You are tasked with designing a simple system to manage books in a library.
// Implement a Kotlin program using classes to represent books and library operations.
//
//Requirements:
//
//Create a Book class with the following properties:

//title (String): The title of the book.
//author (String): The author of the book.
//isbn (String): The ISBN (International Standard Book Number) of the book.
//numPages (Int): The number of pages in the book.
class Books(){
    lateinit var bTitle:String
    lateinit var bAuthor:String
    lateinit var bIsbn:String
    lateinit var bPages:String
    var numBooks:Int  = 0



    //Implement methods in the Book class to:
//
//        Get and set the properties of the book.
//Display information about the book.
    fun displayBook(bTitle:String, bAuthor:String, bIsbn:String, bPages:Int ){

        println("-------------PRINTING BOOK DETAILS------------------\n" +
                "BOOK TITLE: $bTitle\n" +
                "BOOK AUTHOR: $bAuthor\n" +
                "BOOK ISBN: $bIsbn\n" +
                "BOOK PAGES: $bPages")
    }


}

fun main() {
    var book = Books()
    book.displayBook("THE ALIEN WOMAN", "lAURENCE", "142516", 20)

}
//


//Create a Library class to manage books. It should have the following functionality:
//
//Add a book to the library.
//Remove a book from the library.
//Display all books in the library.
//Implement a simple Kotlin program to test your classes. Your program should:
//
//Create a few Book objects.
//Add them to a Library object.
//Display all books in the library.
//Remove a book from the library.
//Display the updated list of books in the library










//create a class Teacher, declare two properties of the class and create an object of the class,
// and print its properties

