package chap05.section04

/**
 * 뮤터블리스트
 * Created by KMS on 2021/03/21.
 */
fun main() {
    val fruits: MutableList<String> = mutableListOf("Apple", "Banana", "Grape")
    println(fruits::class) //class java.util.ArrayList

    fruits.add("Orange")

    println(fruits)
    println(fruits::class)
    println(fruits.javaClass)
}