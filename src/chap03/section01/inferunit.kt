package chap03.section01

/**
 * 모든 함수는 표현식이다
 * Created by KMS on 2021/03/21.
 */
fun main() {
    fun sayHello() = println("Well, hello")

    // Unit 리턴으로 타입 미스매치
    //val message: String = sayHello() //ERROR
    //type mismatch: inferred type is Unit but String was expected
}