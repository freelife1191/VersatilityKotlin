package chap02.section06

/**
 * 멀티라인 문자열
 * RAW 문자열을 이용해서 멀티라인 스트링을 만든다
 * Created by KMS on 2021/03/21.
 */
fun main() {
    val name = "Eve"

    val memo = """Dear $name, a quick reminder about the
party we have scheduled next Tuesday at
the 'Low Ceremony Cafe' at Noon. | Please plan to..."""

    println(memo)

}