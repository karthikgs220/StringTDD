package STringTest;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class TestCase8 {

	@Test
	void test() throws Exception {
		StringCalculator st = new StringCalculator();
		String s1 = "-1,2,3";
		int out = st.add(s1);
		assertEquals(6, out);
	}

}
