package chap06.section02

/**
 * Null 가능 타입 사용하기
 * Created by KMS on 2021/03/28.
 */
fun main() {
    fun nickName(name: String?): String? {
        if (name == "William") {
            return "Bill"
        }

        if (name != null) {
            return name.reversed()
        }

        return null
    }

    println("Nickname for William is ${nickName("William")}")
    println("Nickname for Venkat is ${nickName("Venkat")}")
    println("Nickname for null is ${nickName(null)}")
}