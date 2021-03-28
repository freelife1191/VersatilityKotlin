package chap03.section02

/**
 * 명시적 아규먼트(Named Argument)를 이용한 가독성 향상
 * 함수의 변경으로 인한 파라미터 추가시 함수에 발생할 수 있는 잠재적인 오류의 가능성들을 제거해 준다
 * Created by KMS on 2021/03/21.
 */
fun main() {
    fun createPerson(name: String, age: Int = 1, height: Int, weight: Int) {
        println("$name $age $height $weight")
    }

    // 파라미터의 추측이나 분석이 필요
    createPerson("Jake", 12, 152, 43)

    // 추측이 불필요 의미를 잘 파악하기 쉬움
    createPerson(name = "Jake", age = 12, weight = 43, height = 152)

    createPerson("Jake", age = 12, weight = 43, height = 152)

    createPerson("Jake", 12, weight = 43, height = 152)

    createPerson(weight = 43, height = 152, name = "Jake")

    createPerson("Jake", weight = 43, height = 152)
}