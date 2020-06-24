package STringTest;

public class StringCalculator {
	
	public int add(String numbers) throws Exception {
		int sum = 0;
		boolean flag = false;
		String temp = "0";
		String temp1= "";
			if (numbers.isEmpty())
				sum=0;
			else
			{
				for (int i=0;i<numbers.length();i++)
				{
					char c = numbers.charAt(i);
					char a = '-';
					if(Character.isDigit(c)) {
						temp += c;
						if (Integer.parseInt(temp) > 1000)
							temp="0";						
					}
					else if (c == a) {
						char cp = numbers.charAt(i+1);
						if(Character.isDigit(cp))
						{
							temp1+="-"+cp;
							flag = true;
							
						}
						
					}
					else
					{
						sum+=Integer.parseInt(temp);
						temp="0";
					}
				}
				
				if (flag)
					throw new Exception("No negetive numbers "+ temp1);
			}
			
	return sum+Integer.parseInt(temp);
	}
}
