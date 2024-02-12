open class Subjects() {
    var subjectName:String="Kotlin"
    var subjectTeacher:String="Kasule"

    //method to print subject and its teacher
    open fun allocateSubject(){
        println("----------SUBJECT - TEACHER--------\n" +
                "$subjectName: - $subjectTeacher")
    }



}