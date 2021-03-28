package chap06.section06.part1

/**
 * 6-6 구체화된 타입 파라미터
 * 리팩토링 전 ofClass를 타입 체크와 타입 캐스팅을 위해 사용
 * Created by KMS on 2021/03/28.
 */

abstract class Book(val name: String)
class Fiction(name: String) : Book(name)
class NonFiction(name: String) : Book(name)

fun <T> findFirst(books: List<Book>, ofClass: Class<T>): T {
    val selected = books.filter { book -> ofClass.isInstance(book) }

    if(selected.size == 0) {
        throw RuntimeException("Not found")
    }

    return ofClass.cast(selected[0])
}

fun main() {
    val books: List<Book> = listOf(
        Fiction("Moby Dick"), NonFiction("Learn to Code"), Fiction("LOTR"))

    println(findFirst(books, NonFiction::class.java).name) //Learn to Code
}