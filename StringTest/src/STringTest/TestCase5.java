package STringTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase5 {

	@Test
	void test() throws Exception {
		StringCalculator st = new StringCalculator();
		String s1 = "1,2,-3";
		int out = st.add(s1);
		assertEquals(0, out);
	}

}
