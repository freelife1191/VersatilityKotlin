package chap04.section01

/**
 * 레인지 클래스
 * Created by KMS on 2021/03/21.
 */
fun main() {
    // 1 ~ 5까지 숫자의 범위 (IntRange를 적지 않아도 타입추론 가능)
    val oneToFive: IntRange = 1..5
    // 알파벳의 범위를 사용
    val aToE: CharRange = 'a'..'e'
    // String 이용
    val seekHelp: ClosedRange<String> = "hell".."help"

    println(oneToFive)
    println(aToE)
    println(seekHelp)


    println(seekHelp.contains("helm")) //true
    println(seekHelp.contains("helq")) //false

    // 정방향 반복
    for (i in 1..5) { print("$i, ") } //1, 2, 3, 4, 5,

    println()

    // 문자를 이용해서 반복
    for (ch in 'a'..'e') { print(ch) } //abcde
}
// output
/*
1..5
a..e
hell..help
true
false
1, 2, 3, 4, 5,
abcde
*/
