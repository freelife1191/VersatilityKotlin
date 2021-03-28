package chap05.section04

/**
 * 리스트 사용하기
 * Created by KMS on 2021/03/21.
 */
fun main() {
    val fruits: List<String> = listOf("Apple", "Banana", "Grape")
    println(fruits) //[Apple, Banana, Grape]

    // 전통적인 get() 메소드를 사용해 리스트의 요소들에 접근
    println("first's ${fruits[0]}, that's ${fruits.get(0)}")
    //first's Apple, that's Apple

    println(fruits.contains("Apple")) //true
    println("Apple" in fruits) //true

    // 이뮤터블 리스트에 추가하려고 할시 에러 발생
    /*
    fruits.add("Orange") //ERROR: unresolved reference: add
    */

    val fruits2 = fruits + "Orange"
    println(fruits) //[Apple, Banana, Grape]
    println(fruits2) //[Apple, Banana, Grape, Orange]

    val noBanana = fruits - "Banana"
    println(noBanana) //[Apple, Grape]

    println(fruits::class) //class java.util.Arrays$ArrayList
    println(fruits.javaClass) //class java.util.Arrays$ArrayList

}