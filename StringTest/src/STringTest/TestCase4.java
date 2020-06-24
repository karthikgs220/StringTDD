package STringTest;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class TestCase4 {

	@Test
	void test() throws Exception {
		StringCalculator st = new StringCalculator();
		String s1 = "-2abcd4jjhh1.3hhff";
		int out = st.add(s1);
		assertEquals(0, out);
	}

}
