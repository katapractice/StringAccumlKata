package controller;

public class Controller
{
	
	
	public void start()
	{
		 accumulate("ZpglnRxqenU");
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
				System.out.println("The index is " + (indexChar + 1) + " z is " + z + " " + returnString.concat(String.valueOf(s.charAt(i))));
				z++;
			}
			if(z == s.length())
			{
				
			}
			else
			{
//				returnString = returnString.concat("-");
			}
			
			
			
			i++;
		}
		
		return returnString;
	}
}
