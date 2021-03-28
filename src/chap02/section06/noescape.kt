package chap02.section06

/**
 * Created by KMS on 2021/03/21.
 */
fun main() {
    val name = "John"

    val escaped = "The kid asked, \"How's it going, $name?\""

    val raw = """The kid asked, "How's it going, $name?""""

    println(escaped)
    println(raw)
}