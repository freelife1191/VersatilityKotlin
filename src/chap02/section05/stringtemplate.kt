package chap02.section05

/**
 * 문자열 템플릿 예제
 * Created by KMS on 2021/03/21.
 */
fun main() {
    val price = 12.25
    val taxRate = 0.08

    val output = "The amount $price after tax comes to $${price * (1 + taxRate)}"
    val disclaimer = "The amount is in US$, that's right in \$only"

    println(output)
    println(disclaimer)
}