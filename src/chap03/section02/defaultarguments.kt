package chap03.section02

/**
 * 기본 아규먼트를 통한 함수 변경
 * Created by KMS on 2021/03/21.
 */
fun main() {
    fun greet(name: String, msg: String = "Hello"): String = "$msg $name"

    println(greet("Eve")) //Hello Eve
    println(greet("Eve", "Howdy")) //Howdy Eve
}