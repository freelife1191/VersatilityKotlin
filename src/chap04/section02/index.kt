package chap04.section02

/**
 * indices 속성은 범위 안의 인덱스값을 제공해준다
 * Created by KMS on 2021/03/21.
 */
fun main() {
    val names = listOf("Tom", "Jerry", "Spike")

    // String 리스트를 반복하면서 인덱스를 사용
    for (index in names.indices) {
        println("Position of ${names.get(index)} is $index")
    }
}
// output
/*
Position of Tom is 0
Position of Jerry is 1
Position of Spike is 2
*/
