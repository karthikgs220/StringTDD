package STringTest;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class TestCase12 {

	@Test
	void test() throws Exception {
		StringCalculator st = new StringCalculator();
		String s1 = "1,200,2000";
		int out = st.add(s1);
		assertEquals(201, out);
	}

}
