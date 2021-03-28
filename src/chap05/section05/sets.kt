package chap05.section05

/**
 * 셋 사용하기
 * Created by KMS on 2021/03/21.
 */
fun main() {
    val fruits: Set<String> = setOf("Apple", "Banana", "Apple")

    println(fruits) //[Apple, Banana]

    println(fruits::class) //class java.util.LinkedHashSet
    println(fruits.javaClass) //class java.util.LinkedHashSet
}