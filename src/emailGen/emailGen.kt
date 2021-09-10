package emailGen

/*
* Author: Md Shoaib
* Date: 09/09/2021
* Desc: email Generating
*/

//  Email Generating function
fun emailGen(list: List<String>): List<String>{
    var result = arrayListOf<String>()

    for (emp in list){
        result.add(emp + "@somecompany.com")
    }
    return result
}

fun main() {
    val members = listOf("john", "sarah", "sunil", "methew", "ram")
    println(emailGen(members))
}