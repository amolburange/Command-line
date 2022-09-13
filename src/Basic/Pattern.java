package Basic;

import java.util.Scanner;

public class Pattern {
	public static void main(String[]args) {
	   // Scanner scan= new Scanner(System.in);
		//System.out.println("Enter the number of rows to be printed");
		int rows =1,k=0;
		
		for(int i=1; i<=rows;i++,k=0)
		{
			for(int space=1;space<=rows;++space)
			{
				System.out.println("i");
			}
		}
		while(k!=2*(rows-1))
		{
		System.out.println("*");
		++k;
		}
		System.out.println();
	
		
	}

}
