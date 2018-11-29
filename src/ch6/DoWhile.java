package ch6;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		int data, sum;
		sum=0;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Enter an integer (the input ends if it is 0 ): "); 
		
		data = input.nextInt();
		sum += data;
	}while(data != 0);
		System.out.println("The sum is "+sum);
	
	
	System.out.println("2+x=7");
	int x = 0;
	int y=1;
	do {
		x++;
		if(x==10) {
			y++;
		}
	}while(y+x != 17);
	System.out.println(x);
	}
}
