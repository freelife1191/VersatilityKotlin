package chap05.section06

/**
 * 맵 사용 하기
 * Created by KMS on 2021/03/21.
 */
fun main() {
    val sites = mapOf("pragprog" to "https://www.pragprog.com",
        "agiledeveloper" to "https://agiledeveloper.com")

    println(sites.size) //2

    println(sites.containsKey("agiledeveloper")) //true
    println(sites.containsValue("http://www.example.com")) //false
    println(sites.contains("agiledeveloper")) //true
    println("agiledeveloper" in sites) //true

    /*
    키에 해당하는 값에 접근하기 위해서 get() 메소드를 사용
    아래 코드는 동작하지 않음
    해당 키가 맵에 존재하지 않으면 값이 나오지 않음

    get() 메소드는 키가 맵에 없을 경우 nullable 타입을 리턴한다
    코틀린은 컴파일 시간에 문제를 알려주고 nullable 참조 타입 사용을 권장한다
    */
    /*
    val pragProgSite: String = sites.get("pragprog") //ERROR
    */

    println("#######################################")
    // nullable 타입을 리턴 받도록 ? 를 붙여주면 사용가능
    val pragProgSite: String? = sites.get("pragprog")
    // 인덱스 연산자 []로 사용
    val pragProgSite2: String? = sites["pragprog"]

    // nullable 참조를 피하기 위해 키가 없으면 기본값을 리턴하도록 만듬
    // agiledeveloper 키가 없으면 두 번째 인자를 리턴함
    val agiledeveloper = sites.getOrDefault("agiledeveloper", "http://www.example.com")

    // mapOf() 함수는 읽기전용 참조만 전달해준다
    // 그래서 우리는 맵을 변경할 수가 없다
    // 하지만 우리는 키-값 Pair를 추가해서 새로운 맵을 만들 수 있다
    val sitesWithExample = sites + ("example" to "http://www.example.com")

    // 특정 키/값을 제거한 새로운 맵을 만듬
    val withoutAgileDeveloper = sites - "agiledeveloper"

    // 변수 entry는 맵의 요소들을 참조해서 키와 값을 가지고 옴
    for (entry in sites) {
        println("${entry.key} --- ${entry.value}")
    }
    println("==========================")
    // 구조분해를 이용해서 키와 값을 가지고 옴
    for ((key, value) in sites) {
        println("$key --- $value")
    }
    println("==========================")
    println(sites)
    println("--------------------------")
    println(sitesWithExample)
    println("--------------------------")
    println(withoutAgileDeveloper)
    println("--------------------------")
    println(pragProgSite)
    println("--------------------------")
    println(pragProgSite2)
    println("--------------------------")
    println(agiledeveloper)
    println("--------------------------")
}