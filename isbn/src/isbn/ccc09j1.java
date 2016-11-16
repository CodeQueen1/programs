package isbn;

import java.util.Scanner;

public class ccc09j1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int a = scn.nextInt() * 3;
		int b = scn.nextInt();
		int c = scn.nextInt() * 3;
		int sum = a + b + c;
		System.out.print("The 1-3-sum is " + sum);

	}

}
