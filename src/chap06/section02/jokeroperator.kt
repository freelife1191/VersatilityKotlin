package chap06.section02

/**
 * 사용해서는 안될 안전하지 않은 확정 연산자 !!
 * Created by KMS on 2021/03/28.
 */
fun main() {
    fun nickName(name: String?): String {
        if (name == "William") {
            return "Bill"
        }

        return name!!.reversed().toUpperCase() //BAD CODE
    }

    println("Nickname for Venkat is ${nickName("Venkat")}")
    println("Nickname for null is ${nickName(null)}")
}