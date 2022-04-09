package testproperties;

public class MainTest {
	public static void main(String[] args) {
		PropertiesTest pro = new PropertiesTest("Nguyễn văn tú", 14012003, "mơ chùa");

		TestClass te = new TestClass(pro, "code java");
		te.name();

	}

}
