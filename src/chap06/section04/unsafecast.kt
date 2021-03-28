package chap06.section04

/**
 * 6-4 명시적 타입 캐스팅
 * Created by KMS on 2021/03/28.
 */
fun main() {
    fun fetchMessage(id: Int): Any =
        if (id == 1) "Record found" else StringBuilder("data not found")

    for (id in 1..2) {
        // ClassCastException 예외가 발생한다
        println("Message length: ${(fetchMessage(id) as String).length}")
    }
}