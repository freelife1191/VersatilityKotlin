package chap06.section04

/**
 * 6-4 명시적 타입 캐스팅
 * 엘비스 연산자를 이용해서 length를 적절하게 대응시킴
 * Created by KMS on 2021/03/28.
 */
fun main() {
    fun fetchMessage(id: Int): Any =
        if (id == 1) "Record found" else StringBuilder("data not found")

    for (id in 1..2) {
        println("Message length: ${(fetchMessage(id) as? String)?.length ?: "---"}")
    }
}