# 6-2 Null 가능 참조

not-null 확정(not-null assertion) 연산자 !!
String? 타입이 name이 null 이 아니라는 사실을 알고 있다면 ?. 연산자와 ?: 연산자를 !!로 바꿀 수 있다

`return name!!.reversed().toUpperCase() //BAD CODE`

name이 null이 아니라고 확신했으므로 name이 null이면 NullPointerException으로 프로그램이 끝난다