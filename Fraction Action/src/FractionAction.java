import java.util.Scanner;

public class FractionAction {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		if (num1 == 0){
			System.out.println("0");
		}
		double rawQuo = num1/num2;
		int ndQuo = (int)rawQuo;  
		int answer = ndQuo * num2;
		if(ndQuo == 0){
			System.exit(ndQuo);
		}
		else{
			
		System.out.print(ndQuo);
		}
		int remainder = num1 - answer; 
		 if (remainder == 0){
			 System.exit(remainder);
		 }
		int num = remainder;
		int den = num2;
		if (num < 0)
			num = 0 - num;
		if (den < 0)
			den = 0 - den;
		
		while (num != den)
		{
			if (num > den)
				num -= den;
			else
				den -= num;
		}
		
		int finalnum = remainder / num;
		int finalden = num2 / num;	
		System.out.println(" " + finalnum+"/"+finalden);
	}

}
