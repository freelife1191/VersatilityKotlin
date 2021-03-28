package chap06.section02

/**
 * null은 에러를 유발한다
 * Created by KMS on 2021/03/28.
 */
fun main() {

    fun nickName(name: String): String {
        if (name == "William") {
            return "Bill"
        }

        return ""
        // return null //ERROR
    }

    println("Nickname for William is ${nickName("William")}")
    println("Nickname for Venkat is ${nickName("Venkat")}")
    // println("Nickname for null is ${nickName(null)}") //ERROR

}