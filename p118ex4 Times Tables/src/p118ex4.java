import java.util.Scanner;

public class p118ex4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int multiple = scn.nextInt();
		for (int i = 1; i <= multiple; i++){
			int answer = i * multiple;
			System.out.println(multiple + " x " + i + " = " + answer);
		}
		

	}

}
