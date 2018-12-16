package testCode;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BeforeAfterTest {

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

}
