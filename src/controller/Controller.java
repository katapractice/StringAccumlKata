package controller;

public class Controller
{
	
	
	public void start()
	{
		System.out.println(charArrayVersion("ZpglnRxqenU"));
	}
	
	
	private String charArrayVersion(String s)
	{
		String stringToReturn = "";
		
		char[] sArray = s.toCharArray();
		
		int i = 0;
		while(i < sArray.length)
		{
			int z = 0;
			while(z < i + 1)
			{
				if(z == 0)
				{
					stringToReturn = stringToReturn + (String.valueOf(s.charAt(i))).toUpperCase();
				}
				else
				{
					stringToReturn = stringToReturn + (String.valueOf(s.charAt(i))).toLowerCase();
				}
				
				z++;
			}
			
			
			if(z != s.length())
			{
				stringToReturn = stringToReturn.concat("-");
			}
			
			i++;
		}
		
		
		return stringToReturn;
	}
	
	
	
}
