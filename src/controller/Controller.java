package controller;

public class Controller
{
	
	
	public void start()
	{
		 System.out.println(accumulate("abcd"));
	}
	
	
	private String accumulate(String s)
	{
		String returnString = "";
		
		int i = 0;
		while(i < s.length())
		{
			char getCharAtIndex = s.charAt(i);
			int indexChar = s.indexOf(getCharAtIndex);
			
			int z = 0;
			while(z < indexChar + 1)
			{
				returnString = returnString.concat(String.valueOf(s.charAt(i)));
				z++;
			}
			returnString.concat("-");
			
			
			i++;
		}
		
		return returnString;
	}
}
