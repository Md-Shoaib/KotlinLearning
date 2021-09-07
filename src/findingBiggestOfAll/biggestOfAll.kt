package findingBiggestOfAll

/*
* Author: Md Shoaib
* Date: /09/2021
* Desc: Finding biggest of all
*/

fun main() {
    var numberOne: Int = 3
    var numberTwo: Int  = 4
    var numberThree: Int  = 5

    if (numberOne > numberTwo && numberOne > numberThree) {
        println("$numberOne is biggest")
    } else if (numberTwo > numberTwo && numberTwo > numberThree){
        println("$numberTwo is biggest")
    } else {
        println("$numberThree is the biggest")
    }

}
