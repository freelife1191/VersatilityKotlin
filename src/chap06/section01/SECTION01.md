# 6-1 Any와 Nothing 클래스

## 베이스 클래스 Any
코틀린의 모든 클래스는 Any를 상속받았다
코틀린의 to() 메소드는 모든 타입의 모든 객체를 사용할 수 있는 Any 타입으로 구성된 Pair를 만들 수 있다
Any는 Let(), run(), apply(), also()같은 확장함수를 가지고 있다

## Nothing은 void 보다 강력하다
코틀린에서는 표현식이 리턴을 하지 않을때 void 대신 Unit를 사용한다
함수가 아무것도 리턴하지 않을 때는 Nothing 클래스가 필요하다
Nothing 클래스는 인스턴스가 없고 값이나 결과가 영원히 존재하지 않을 것이라는 걸 나타낸다
Nothing은 모든 것을 대표할 수 있느 유니크한 기능이 있다

Nothing은 Int, Double, String 등 모든 클래스로 대체할 수 있다

예외는 Nothing 타입을 대표한다
Nothing의 유일한 목적은 컴파일러가 프로그램의 타입 무결성을 검증하도록 도와준다