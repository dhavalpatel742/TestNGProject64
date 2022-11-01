package selenium;

import org.testng.annotations.Test;

public class Testing2 {
 
	@Test (groups = "reg")
	public void test4() {
		System.out.println("test4");
	}
	
	@Test (groups = "important")
	public void test5() {
		System.out.println("test5");
	}
}
