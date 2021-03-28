package chap03.section01

/**
 * 파라미터 정의하기
 * Created by KMS on 2021/03/21.
 */
fun main() {
    fun greet(name: String): String = "Hello $name"

    println(greet("Eve")) //Hello Eve
}