package Section1.lecture3;

import Section1.Person;

public class lecture3_java {

	public static void main(String[] args) {

	}

	public static void printAgeIfPerson(Object obj) {
		if (obj instanceof Person) {
			Person person = (Person) obj;
			System.out.println(person.getAge());
		}
	}
}
