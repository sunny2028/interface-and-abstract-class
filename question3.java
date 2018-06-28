import java.util.*;
public class utilityfunction {
	
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int a=Integer.parseInt(sc.nextLine());
			int b =Integer.parseInt(sc.nextLine());
			if(a>b)
				System.out.println("first number is bigger");
			else if(a<b)
				System.out.println("second number is bigger");
			else
				System.out.println("both are equal");
		}
	}
