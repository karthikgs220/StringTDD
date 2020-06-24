package STringTest;

public class calculator {

	public static void main(String[] args) throws Exception {
		StringCalculator s = new StringCalculator();
		String st = "1,2000,3";
		int o = s.add(st);
		System.out.println("Output is " + o);
		
		int a = s.GetCalledCount();
		System.out.println("No of calls "+ a);

	}

}
