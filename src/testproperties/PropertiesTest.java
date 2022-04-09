package testproperties;

public class PropertiesTest {

	String name;
	int age;
	String address;

	public PropertiesTest(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void dislpay() {

		System.out.println("hello test pro");

	}

	@Override
	public String toString() {
		return "PropertiesTest [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}
