package Section1.lecture2

import Section1.Person

/** 코틀린에서 null 다루는 방법
 *  kotlin에서 null 체크
 *  Safe call과 Elvis 연산자
 *  null 아님 단언
 *  플랫폼 타입
 */
fun main() {
    /* safe call
    null이 아니면 실행하고,
    null이면 실행하지 않는다. (그대로 null)
    */

    // Elvis 연산자 ?: 키워드를 사용함으로써 null이 들어올 경우 실행되는 구문을 구현한다.
    val str: String? = null
//    println(str?.length ?: 0)

    print(startsWithA4(str))

    var person = Person("공부하는 개발자")
    startsWithA5(person.name)
}

// null 체크
fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다.")

//    if (str == null)
//        throw IllegalArgumentException("null이 들어왔습니다.")
//    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
//    if (str == null)
//        return null
//    return str.startsWith("A")
}

// Kotlin에서도 null 체크를 하기에 바로 함수 호출 못하게끔 막는다.
fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
//    if (str == null)
//        return false;
//    return str.startsWith("A")
}

fun startsWithA4(str: String?): Boolean {
    // null이 들어오면 런타임 시점에서  nullPointException이 발생된다.
    // 즉, null이 절대 들어와서는 안되는 파라미터를 넣어야 한다.
    return str!!.startsWith("A");
}

fun startsWithA5(str: String): Boolean {
    return str.startsWith("A");
}

