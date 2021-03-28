package chap05.section02

/**
 * 공항의 온도를 공항 코드별로 수집하는 예제
 * 코틀린은 두 개의 사이즈(2개, 3개)의 튜플만을 허용한다
 * Created by KMS on 2021/03/21.
 */
fun main() {
    val airportCodes = listOf("LAX", "SFO", "PDX", "SEA")

    // airportCodes가 가지고 있던 공항 코드를 (코드, 온도)꼴의 Pair로 도치시킴
    val temperatures = airportCodes.map { code -> code to getTemperatureAtAirport(code) }

    for (temp in temperatures) {
        println("Airport: ${temp.first}: Temperature: ${temp.second}")
    }
}
fun getTemperatureAtAirport(code: String): String =
    "${Math.round(Math.random() * 30) + code.count()} C"
