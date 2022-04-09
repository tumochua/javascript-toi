package testproperties;

public class TestClass {

	PropertiesTest pro2;
	String job;

	public TestClass(PropertiesTest pro2, String job) {
		this.pro2 = pro2;
		this.job = job;
	}

	public void name() {
		System.out.println(this.pro2);

	}

	@Override
	public String toString() {
		return "TestClass [pro2=" + pro2 + ", job=" + job + "]";
	}

}
