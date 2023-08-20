package Section1.lecture1;

import Section1.Person

fun main() {
    /**
     * var는 가변성이 존재
     * val은 불변 (가변성이 존재 x)
     * 그러나 val은 최초 초기화 되지 않은 변수이면, 한번 변수 할당이 가능하다.
     */
    var number1 = 10L // variable
//    number1 = 5L
    println(number1);

    // 코틀린도 마찬가지로 val 변수에 재정의는 안되지만 추가, 삭제가 가능하다.

    val number2 = 10L // value
    // number2 = 5L


    // Primitive Type
    /*
    Primitive Type: long
    reference Type: Long
    연산할 때 reference 타입을 사용하지 않는다.
    boxing과 unboxing 과정에서 불필요한 객체를 생성하기 때문이다.

    그러나 코틀린은 내부적으로 특별한 표현을 가진다.
    연산을 하게 될 경우 상황에 따라 내부적으로 primitive Type으로 변환하여 연산하게 해준다.
     */

    // nullable
    /*
    코틀린은 기본적으로 null이 들어갈 수 없게 설계가 되어있다.
    그래서 명시적 타입을 지정하고 ? 키워드를 사용하여 nullable로 바꿀 수 있게 한다.
     */
    var number3: Long? = 1_000L
    number3 = null

    // 자바와 다르게 new를 사용하지 않고 객체 인스턴스 생성을 한다. 절대 new를 사용하지 않는다.
    var person = Person("차윤범", 26)

}
