package chap02.section04

/**
 * 코틀린의 구조상의 동일성 연산자 ==는 null 참조를 안전하게 다룬다
 * Created by KMS on 2021/03/21.
 */
fun main() {
    println("hi" == "hi")
    println("hi" == "Hi")
    println(null == "hi")
    println("hi" == null)
    println(null == null)
}