package Section1;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Person {
	private final String name;
	private final Integer age;

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	@NotNull
	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}
}
