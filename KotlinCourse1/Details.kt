class Details:Subjects() {


    override fun allocateSubject(){
        println("The teacher $subjectTeacher teaches $subjectName")
    }


}


fun main() {
    val details = Details()
    details.allocateSubject()
}



//create a class and implement addition of two numbers,
//inherit it in another class and override the addition function to implement
//subtraction of two numbers