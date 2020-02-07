import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ThingTest {

	@Test
	void testName() {
		Thing test = new Thing("Test");
		assertEquals(test.toString(),"Test");
	}

}
