package chap06.section02

/**
 * when의 사용
 * Created by KMS on 2021/03/28.
 */
fun main() {
    fun nickName(name: String?) = when (name) {
        "William" -> "Bill"
        null -> "Joker"
        else -> name.reversed().toUpperCase()
    }

    println("Nickname for William is ${nickName("William")}")
    println("Nickname for Venkat is ${nickName("Venkat")}")
    println("Nickname for null is ${nickName(null)}")
}