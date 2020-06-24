package STringTest;

public class StringCalculator {
	
	public int add(String numbers) throws Exception {
		int sum = 0;
		String temp = "";
			if (numbers.isEmpty())
				sum=0;
			else
			{
				for (int i=0;i<numbers.length();i++)
				{
					char c = numbers.charAt(i);
					if(Character.isDigit(c)) {
						temp += c;
						sum+=Integer.parseInt(temp);
					}
					else {
						temp="0";
						sum+=Integer.parseInt(temp);
					}
				}
			}
			
	return sum;
	}
}
