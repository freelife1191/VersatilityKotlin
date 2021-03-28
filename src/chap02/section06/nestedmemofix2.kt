package chap02.section06

/**
 * 멀티라인 문자열의 시작 구분점을 기본값인 파이프라인(|) 대신 물결표(~) 사용
 * Created by KMS on 2021/03/21.
 */
fun main() {
    fun createMemoFor(name: String): String {
        if (name == "Eve") {
            val memo = """Dear $name, a quick reminder about the
        ~party we have scheduled next Tuesday at
        ~the 'Low Ceremony Cafe' at Noon. | Please plan to..."""

            return memo.trimMargin("~")
        }

        return ""
    }

    println(createMemoFor("Eve"))
}