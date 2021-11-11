package week1.day1;

public class Number {
	public static void main(String[] args) {
		
		int num=-24;
		
		if(num<0)
		{
			System.out.println("The number is negative number" +num);
			
			int newnum= num * -1;
			
			System.out.println("The converted positive number is" +newnum);
		}
		else
		{
			System.out.println("The number is positive number");
		}

	}

}
