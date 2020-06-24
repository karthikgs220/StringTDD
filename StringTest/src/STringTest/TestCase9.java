package STringTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase9 {

	@Test
	void test() throws Exception {
		StringCalculator st = new StringCalculator();
		String s1 = "//[***]\\n1***2***3";
		int out = st.add(s1);
		assertEquals(6, out);
	}

}
