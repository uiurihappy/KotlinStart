package Section1;

fun main() {
    /**
     * var는 가변성이 존재
     * val은 불변 (가변성이 존재 x)
     * 그러나 val은 최초 초기화 되지 않은 변수이면, 한번 변수 할당이 가능하다.
     */
    var number1: Long = 10L // variable
//    number1 = 5L
    println(number1);
    val number2 = 10L // value
    // number2 = 5L
}
