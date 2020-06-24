package STringTest;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class TestCase10 {

	@Test
	void test() throws Exception {
		StringCalculator st = new StringCalculator();
		String s1 = "//[*][%]\n1*2%3";
		int out = st.add(s1);
		assertEquals(6, out);
	}

}
