package chap02.section06

/**
 * 멀티라인 문자열이 함수 안에 있으면 들여쓰기가 포함되어 버린다
 * Created by KMS on 2021/03/21.
 */
fun main() {
    fun createMemoFor(name: String): String {
        if (name == "Eve") {
            val memo = """Dear $name, a quick reminder about the
        party we have scheduled next Tuesday at
        the 'Low Ceremony Cafe' at Noon. | Please plan to..."""

            return memo
        }

        return ""
    }

    println(createMemoFor("Eve"))
}