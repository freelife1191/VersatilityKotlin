package chap04.section02

/**
 * 인덱스와 위치 한번에 얻기 withIndex()
 * Created by KMS on 2021/03/21.
 */
fun main() {
    val names = listOf("Tom", "Jerry", "Spike")

    for ((index, name) in names.withIndex()) {
        println("Position of $name is $index")
    }
}