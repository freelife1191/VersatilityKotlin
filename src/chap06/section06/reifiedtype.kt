package chap06.section06.part2

/**
 * 6-6 구체화된 타입 파라미터
 * reified 타입 파라미터를 사용하도록 리팩토링
 * Created by KMS on 2021/03/28.
 */
abstract class Book(val name: String)
class Fiction(name: String) : Book(name)
class NonFiction(name: String) : Book(name)

// 함수 안에서 타입 체크와 캐스팅용으로 사용 가능
// reified는 inline 함수에서만 사용 가능
inline fun <reified T> findFirst(books: List<Book>): T {
    val selected = books.filter { book -> book is T }

    if(selected.size == 0) {
        throw RuntimeException("Not found")
    }

    return selected[0] as T
}

fun main() {
    val books: List<Book> = listOf(
        Fiction("Moby Dick"), NonFiction("Learn to Code"), Fiction("LOTR"))

    println(findFirst<NonFiction>(books).name) //Learn to Code
}