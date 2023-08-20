package Section1.lecture4

import Section1.JavaMoney
import Section1.Money

/** Kotlin에서 연산자를 다루는 방법
 * 단항 연산자 / 산술 연산자 (Java와 완전 동일)
 * 비교 연산자, 동등성, 동일성
 * 논리 연산자, Kotlin에 있는 특이한 연산자
 * 연산자 오버로딩
 */
fun main() {


    val money1 = 1_000L
    val money2 = 2_000L

    if (money1 > money2) { // 비교 연산자를 사용하면 자동으로 compareTo를 호출한다.
        println("money1이 money2보다 금액이 큽니다")
    }

    /* 비교 연산자의 동등성, 동일성
    - 동등성: 두 객체가 같은 값인가?
    - 동일성: 완전히 동일한 객체인가? 즉, 주소값도 같은가?
    Java에서의 동일성은 == 사용, 동등성은 equals를 사용하였는데,
    Kotlin에서는 동일성을 === 사용, 동등성은 == 을 사용한다.
    == 를 사용하면 간접적으로 equals를 호출한다.
     */

    val money3 = JavaMoney(1_000L)
    val money4 = money3
    val money5 = JavaMoney(1_000L)

    println(money3 === money4) // 주소가 같으니까 true
    println(money3 === money5) // 주소가 다르니까 false
    println(money3 == money5) // 값을 비교하니 true


    if (fun1() || fun2()) // fun2를 보지 않는다.
        println("본문")

    if (fun1() && fun2()) // 둘 다 보기에 fun2를 호출한다.
        println("본문")

    /*
    in / !in
     - 컬렉션이나 범위에 포함되어 있다, 포함되어 있지 않다.
     a..b
     - a부터 b까지의 범위 객체를 생성한다.
     a[i]
     - a에서 특정 index i로 값을 가져온다.
     a[i] = b
     - a에서 특정 index i에 b를 넣는다.
     */
//    val numbers: List<Int> =
//    println(1 in numbers)

    // 연산자 오버로딩
    val money6 = Money(1_000L)
    val money7 = Money(1_000L)
    println(money6 + money7) // toString 개발된 대로 출력된다.

}


// Lazy 연산이란건 fun2를 호출하지 않고 바로 본문 실행하게 한다.
fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return false
}