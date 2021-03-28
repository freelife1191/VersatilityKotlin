package chap05.section01

/**
 * 코틀린이 제공하는 편리한 메소드들
 * withIndex() 메소드를 제공해서 인덱스와 값 모두를 편하게 얻게 해준다
 * Created by KMS on 2021/03/21.
 */
fun main() {
    val names = listOf("Tom", "Jerry")

    println(names.javaClass)

    for ((index, value) in names.withIndex()) {
        println("$index $value")
    }
}