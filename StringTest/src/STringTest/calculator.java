package STringTest;

public class calculator {

	public static void main(String[] args) throws Exception {
		StringCalculator s = new StringCalculator();
		String st = "1,-2,3";
		int o = s.add(st);
		System.out.println("Output is " + o);

	}

}