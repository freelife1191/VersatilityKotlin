package chap06.section02

/**
 * 세이프 콜 연산자
 * 엘비스 연산자(Elvis Operator)
 * Created by KMS on 2021/03/28.
 */
fun main() {
    fun nickName(name: String?): String? {
        if (name == "William") {
            return "Bill"
        }

        return name?.reversed()?.toUpperCase()
    }

    println("Nickname for William is ${nickName("William")}")
    println("Nickname for Venkat is ${nickName("Venkat")}")
    println("Nickname for null is ${nickName(null)}")
}