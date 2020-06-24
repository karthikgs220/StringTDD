package STringTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testcase7 {

	@Test
	void test() throws Exception {
		StringCalculator st = new StringCalculator();
		String s1 = "“//;\\n1;2";
		int out = st.add(s1);
		assertEquals(3, out);
	}

}
