package myfirst;

public class duplicatestr {
	public static void main(String [] args)
	{   
		String s3="my name is jyoti parkash";
		String[] strarray=s3.split("");	
		String reversestring="";
		
		for(int i=0;i<strarray.length;i++)
		{
			 
			 String word = strarray[i];
			 String reverseword="";
			 
			 for (int j=0;j<word.length();j++)
				{
					reverseword=word.charAt(j)+reverseword;
				}
			 
				 reversestring= reversestring+reverseword+"";
			 		 
		}
		
		System.out.println("the revese string is \n"+reversestring);
		
	String s1 = "w3resource";
	String s2 = "";

	for(int i = 0 ; i < s1.length() ; i++)
	{
	int j;
	for(j = 0 ; j < i ; j++)
	{
	
	if(s1.charAt(i) == s1.charAt(j))
	{
	break;
	}
	}
	if(i == j)
	{
	s2 += s1.charAt(i);
	}
	}

	System.out.println(s2);
	}

}
