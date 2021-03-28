package chap03.section01

/**
 * 모든 함수는 표현식이다
 * Created by KMS on 2021/03/21.
 */
fun main() {
    fun sayHello(): Unit = println("Well, hello")

    // 리턴 타입으로 Unit을 지정
    val message: Unit = sayHello()
    // Unit의 toString() 메소드는 kotlin.Unit 이라는 클래스의 이름만 리턴함
    println("The result of sayHello is $message")
}