package chap06.section04

/**
 * 명시적 타입 캐스팅
 * is 연산자를 사용하는 것이 좋지만 안전한 대응 연산자인 as? 를 쓴다면 동작한다
 * Created by KMS on 2021/03/28.
 */
fun main() {
    fun fetchMessage(id: Int): Any =
        if (id == 1) "Record found" else StringBuilder("data not found")

    run {
        // ClassCastException 예외가 발생한다
        val message: String = fetchMessage(1) as String

        println(message)
    }

    run {
        // as? 를 사용하면 Exception 없이 잘동작한다
        val message: String? = fetchMessage(2) as? String

        println(message)
    }
}