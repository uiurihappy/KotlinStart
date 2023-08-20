package Section1.lecture4;

import Section1.JavaMoney;
import org.jetbrains.annotations.NotNull;

public class lecture4_java  {

	public static void main(String[] args) {
		JavaMoney money1 = new JavaMoney(1_000L);
		JavaMoney money2 = money1;
		JavaMoney money3 = new JavaMoney(1_000L);

		if (money1.compareTo(money2) > 0) {
			System.out.println("money1이 money2보다 금액이 큽니다");
		}

		System.out.println(money1 == money2); // true
		System.out.println(money1 == money3); // false
		System.out.println(money1.equals(money3)); // true

		System.out.println(money1.plus(money2));
	}

}
