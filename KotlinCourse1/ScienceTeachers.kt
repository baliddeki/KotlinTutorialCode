class ScienceTeachers:Staff() {
    lateinit var scienceSubject:String

    fun printDetails(name:String, scienceSubject:String){
        println("The name is $name and subject taught is $scienceSubject")

    }

}

fun main() {
    var Umar = ScienceTeachers()
    Umar.printDetails("Umar Sekitoleko", "Chemistry")
}