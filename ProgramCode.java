import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ProgramCode 
{
	public static List<String> getFruits(Map<String,String> numbers)
	{
		//Write a program to get a map contains people name and mobile numbers as string.
		//Find the persons having lucky mobile numbers.
		//Lucky mobile numbers are found by find the sum of digits in a mobile number and check whether the sum is a prime or not.
		//If prime Its a lucky number.
		//return those persons as a list
	
		int d,sum=0;
		
		List<String> list=new ArrayList<String>();
		
		for(Map.Entry m:numbers.entrySet())
		{
		long n=Long.parseLong((String) m.getValue());
		System.out.println(n);
	sum=0;	
	while(n!=0)
		{
			
			d=(int) (n%10);
			sum=sum+d;
			n=n/10;
		}
		System.out.println(sum);		
//		Check PRIME
		
		
		boolean flag=true;
		for(int i=2;i<sum/2;i++)
		{
				if(sum%i==0)
				{
					flag=false;
					break;
					
				}
		 }
		if(flag)
			list.add((String) m.getKey());
		}
		


		
		
		
		
		return list;
	}
}
