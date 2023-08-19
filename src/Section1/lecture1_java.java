package Section1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lecture1_java {
	public static void main(String[] args) {
		lecture1_java T = new lecture1_java();
		long number1 = 10L;
		final long number2 = 10L;

		Long number3 = 10L;
		Person person = new Person("차윤범");
		// 자바에서 final 키워드가 붙여지면 컬렉션 자체를 재정의하지 못하지만
		// 추가, 삭제가 가능하다.
		final List<Integer> numbers = Arrays.asList(1, 2);
		numbers.add(4);
		System.out.println(number1);
	}
}
