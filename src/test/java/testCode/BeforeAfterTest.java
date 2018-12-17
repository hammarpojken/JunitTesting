package testCode;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeAfterTest {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class method executed");
	}

	@Before
	public void setup() {
		System.out.println("Setup method executed");
	}

	@Test
	public void test1() {
		System.out.println("test1 executed");
	}

	@Test
	public void test2() {
		System.out.println("test2 executed");
	}

	@After
	public void tearDown() {
		System.out.println("Teardown method executed");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After class method executed");
	}

		
}
