package seleniumpkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewClasstestng {

	@BeforeClass
	public void bg() {
		System.out.println("before");
	}
	@BeforeMethod
	public void bm() {
		
	}
	@Test
	public void testa() {
		System.out.println("print");
	}
	@AfterMethod
	public void am() {
		System.out.println("anything");
	}
	@AfterClass
	public void ac() {
		System.out.println("ac");
	}
}
