package STringTest;

public class StringCalculator {
	public static int count = 0;
	
	public int add(String numbers) throws Exception {
		count++;
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
						temp1+="-";
						if(Character.isDigit(cp))
						{
							int j=i+1;
							for (j=i+1;j<numbers.length();j++) {
								
								if(Character.isDigit(numbers.charAt(j))==true) {
									temp1+=numbers.charAt(j);
								}
								else 
								{
									temp1+=",";
									break;
								}
							}
						}
						flag = true;
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
	
	public int GetCalledCount() {
		return count;
	}
}
