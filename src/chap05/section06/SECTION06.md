# 5-6 맵 사용하기

- `Map<K, V>` - `mapOf()`
- `MutableMap<K, V>` - `mutableMapOf()`
- `HashMap<K, V>` - `hashMapOf()`
- `LinkedHashMap<K, V>` - `linkedMapOf()`
- `SortedMap<K, V>` - `sortedMapOf()`

맵 인터페이스는 2개의 특별한 메소드를 가지고 있다
바로 `getValue()`, `setValue()` 이다
두 메소드는 맵을 대리자(delegate)로 사용 가능하게 해주는 메소드이다