import java.io.*;
public class Question9 {
	/**
	 * @param args
	 */
	static boolean odd(int number1)
	{
		if ((number1%2)!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int number1,number2,i,j,k,sum=0;
		DataInputStream in =new DataInputStream(System.in);
		System.out.println("Enter the number1");
		number1=Integer.parseInt(in.readLine());
		System.out.println("Enter the number2");
		number2=Integer.parseInt(in.readLine());
		while(number1!=0)
		{
			if(odd(number1))
			{
				sum=sum+number2;
			}
			number1=number1/2;
			number2=number2*2;
		}
		
		System.out.println("Value is:"+sum);
		
	}
}