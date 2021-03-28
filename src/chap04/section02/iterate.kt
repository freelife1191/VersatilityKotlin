package chap04.section02

/**
 * Created by KMS on 2021/03/21.
 */
fun main() {
    val array = arrayOf(1, 2, 3)

    // 숫자 배열만들고 클래스 확인
    println(array.javaClass) //class [Ljava.lang.Integer;

    for (e in array) { print("$e, ") } //1, 2, 3,
    println()


    val list = listOf(1, 2, 3)

    // 리스트 만들고 클래스 확인
    println(list.javaClass) //class java.util.Arrays$ArrayList

    for (e in list) { print("$e, ") } //1, 2, 3,
    println()
}