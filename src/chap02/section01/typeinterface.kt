package chap02.section01

/**
 * 세미콜론은 생략해도 된다
 * Created by KMS on 2021/03/21.
 */
fun main() {
    val greet = "hello"

    println(greet)
    println(greet::class)
    println(greet.javaClass)
}