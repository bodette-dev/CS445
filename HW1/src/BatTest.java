import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BatTest {

	@Test
	void testName() {
		Bat test = new Bat("Bart");
		assertEquals(test.toString(),"Bart Bat");
	}

}
