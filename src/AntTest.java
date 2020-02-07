import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AntTest {

	@Test
	void testName() {
		Ant test = new Ant("Alex");
		assertEquals(test.toString(),"Alex Ant");
	}

}
