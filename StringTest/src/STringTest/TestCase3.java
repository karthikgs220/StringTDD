package STringTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase3 {

	@Test
	void test() throws Exception {
		StringCalculator st = new StringCalculator();
		String s1 = "1gabb2hhgg4ffff5hhhh";
		int out = st.add(s1);
		assertEquals(12, out);
	}

}
