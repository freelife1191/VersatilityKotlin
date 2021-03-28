package chap02.section06

/**
 * 개행마다 파이프라인(|)을 넣고 trimMargin() 메소드로 파이프라인(|)이 나올 때까지 공백을 제거
 * Created by KMS on 2021/03/21.
 */
fun main() {
    fun createMemoFor(name: String): String {
        if (name == "Eve") {
            val memo = """Dear $name, a quick reminder about the
        |party we have scheduled next Tuesday at
        |the 'Low Ceremony Cafe' at Noon. | Please plan to..."""

            return memo.trimMargin()
        }

        return ""
    }

    println(createMemoFor("Eve"))

}