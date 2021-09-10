package myDataClass

/*
* Author: Md Shoaib
* Date: 10/09/2021
* Desc: Data Class in Kotlin
*/

class RegularAPI(val url: String, val apikey: String, val q: String){

}

data class DataAPI(val url: String, val apikey: String, val q: String)

fun main() {
    var apicall = RegularAPI("https:///", "apppbbddd", "google")

    var myapi = DataAPI("http://", "hytur", "facebook")

    println(apicall)
    println(myapi)

//    Just casually written
    var (url, api, que) = myapi

    println(url)
    println(api)
    println(que)

}