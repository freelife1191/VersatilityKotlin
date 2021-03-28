package chap03.section01

/**
 * 리턴타입과 타입추론
 * Created by KMS on 2021/03/21.
 */
fun main() {
    fun greet() = "Hello"

    //val message: Int = greet() //ERROR
    //type mismatch: inferred type is String but Int was expected
}