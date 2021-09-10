package defaultValues

/*
* Author: Md Shoaib
* Date: 10/09/2021
* Desc: Default parameters and optional Parameter
*/

class Course(val courseName: String, val courseType: String, val coursePrice: Int){
    fun printCourse(){
        println("Course details [name = $courseName, type = $courseType, price = ${coursePrice}]")
    }
}

fun main() {
    val python = Course(courseName = "Python Course", coursePrice = 200, courseType = "Video")
    python.printCourse()
}