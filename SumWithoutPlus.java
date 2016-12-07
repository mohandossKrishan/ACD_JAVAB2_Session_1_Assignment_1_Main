import java.io.*;  
public class SumWithoutPlus
{  
	public static void main(String args[])throws Exception
	{  
		int firstnumber ,secondnumber,sum;  
		InputStreamReader r=new InputStreamReader(System.in);  
		BufferedReader br=new BufferedReader(r);  
		System.out.println("Enter the first Number :");	
		firstnumber = Integer.parseInt(br.readLine());
		System.out.println("Enter the Second Number :");	
		secondnumber = Integer.parseInt(br.readLine());
		sum = firstnumber - (-1 * secondnumber); 
		System.out.println("The sum of " + firstnumber + " and " + secondnumber + " = " + sum);
   	}  
}  
