import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TigerTest {

	@Test
	void testName() {
		Tiger test = new Tiger("Tyler");
		assertEquals(test.toString(),"Tyler Tiger");
	}

}
