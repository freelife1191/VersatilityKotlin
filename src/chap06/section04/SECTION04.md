# 6-4 명시적 타입 캐스팅
명시적 타입 캐스팅은 컴파일러가 타입을 확실하게 결정할 수 없어 스마트 캐스팅을 하지 못할 경우에만 사용하도록 하자

코틀린은 명시적 타입 캐스트를 위해서 2가지 연산자 as 와 as? 를 제공한다

- 가능한 스마트 캐스트를 사용하라
- 스마트 캐스트가 불가능한 경우에만 안전한 캐스트 연산자를 사용하라
- 애플리케이션이 불타거나 무너지는걸 보고 싶다면 안전하지 않은 캐스트 연산자를 사용하라