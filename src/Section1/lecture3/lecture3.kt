package Section1.lecture3

import Section1.Person

/** Kotlin에서 Type을 다루는 방법
 * 기본 타입
 * 타입 캐스팅
 * Kotlin의 3가지 특이한 타입
 * String Interpolation, String indexing
 */
fun main() {
    val number1: Int? = 3
    val number2: Long = number1?.toLong() ?: 0
    val person = Person("ybchar", 100)
    printAgeIfPerson2(person)

    val garbage = "짱짱맨"
    // String Interpolation, String indexing
     val log = "이름: ${person.name}, 나이: ${person.age} $garbage"
    println(log)

    var testStr = """
        ABCD
        EFGH
        ${person.name}
    """.trimIndent()
    println(testStr)

    println("${person.name[0]} ${person.name[2]}")
}

/* 기본타입
Java와 다른 내용
Java는 기본 타입간에 변환이 암시적으로 이루어질 수 있지만,
Kotlin에서는 기본 타입간에 변환이 명시적으로 이루어져야한다.
 */

fun printAgeIfPerson1(obj: Any) {
    // !is 는 obj가 Person이 아니라는 뜻
    if (obj is Person) {
//        val person = obj as Person
//        println(person.age)
        // 위 코드와 동일한 코드
        println(obj.age) // 스마트 캐스트
    }
}

fun printAgeIfPerson2(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}

/*  Kotlin의 3가지 특이한 타입
1. Any
- Java의 object 역할을 한다.(모든 객체의 최상위 타입)
- 모든 Primitive Type의 최상위 타입도 Any이다,
- Any 자체로는 null을 포함할 수 없어 null로 표한하고 싶으면 ? 키워드를 사용해 Any?를 사용
- Any에는 equals, hashCode, toString이 존재한다.
2. Unit
- Java의 Void와 동일한 역할
- void와 다르게 Unit은 그 자체로도 타입 인자로 사용 가능하다.
- 함수형 프로그래밍에서 Unit은 단 하나의 인스턴스만 갖는 타입을 의미한다. 즉, 코틀린의 Unit은 실제 존재하는 타입이라는 것을 표현
3. Nothing
- 함수가 정상적으로 끝나지 않았다는 사실을 표현
- 무조건 예외를 반환하는 함수 / 무한 루프 함수 등등
 */