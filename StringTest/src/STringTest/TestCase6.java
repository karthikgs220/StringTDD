package STringTest;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class TestCase6 {

	@Test
	void test() throws Exception {
		StringCalculator st = new StringCalculator();
		String s1 = "1\n,2";
		int out = st.add(s1);
		assertEquals(3, out);
	}

}
