# Chapter 06. 오류를 예방하는 타입 안정성

## 정리
nullable 레퍼런스 타입을 non-nullable 레퍼런스 타입에서 분리하면서 컴파일러는 메모리 오버헤드 없이 아주 안정적인 타입 안정성을 가지게 되었다
코틀린은 nullable 레퍼런스로부터 쉽고 유연하게 객체를 가지고 올 수 있는 몇가지 연산자도 제공해준다

스마트 캐스트 기능은 불필요한 캐스팅을 할 필요 없게 만들어주면서 코드의 복잡함을 줄여준다

제네릭 함수와 클래스를 사용할 때 개발자의 니즈를 충족시켜 주기 위해서 파라미터 타입을 조정하여 타입 안정성과 유연성을 제공해준다

게다가 reified 타입 파라미터는 컴파일 시간 타입 안정성을 강화해서 코드의 클러터와 오류를 제거해준다