package STringTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase1 {

	@Test
	void test() throws Exception {
		StringCalculator st = new StringCalculator();
		String s1 = "";
		int out = st.add(s1);
		assertEquals(0, out);
	}

}
