package MainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyClassTest {

	@Test
	public void test() {
		assertEquals("Must return true, function incorrectly written?", true, MyClass.ReturnTrue());
		assertEquals("Numbers given must add up", 1 + 9, MyClass.AddTwoNumbers(1,9));
	}

}
