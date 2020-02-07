import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FlyTest {

	@Test
	void testName() {
		Fly test = new Fly("Frank");
		assertEquals(test.toString(),"Frank Fly");
	}

}
