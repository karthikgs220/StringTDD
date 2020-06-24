package STringTest;

public class StringCalculator {
	
	public int add(String numbers) throws Exception {
		int sum = 0;
		String temp = "";
		try {
			if (numbers.isEmpty())
				sum=0;
			else
			{
				for (int i=0;i<numbers.length();i++)
				{
					char c = numbers.charAt(i);
					if(Character.isDigit(c))
						temp +=c;
					else
					{
						sum+=Integer.parseInt(temp);
						temp="0";
					}				
				}
				sum = sum+Integer.parseInt(temp);
			}
			
		}
		catch (NumberFormatException | NullPointerException ex) {
			throw new Exception("Only positive Integers allowed");
		}
	return sum;
	}
}
