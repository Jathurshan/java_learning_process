import java.util.Scanner;
class ReverseNumberMethod2{
	
	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your input number");
		int inputNumber = scanner.nextInt();
		System.out.println();
		
		int inputLength = Integer.toString(inputNumber).length();
		
		System.out.println("+--------------------------------------+");
		System.out.println("Your input number is: "+ inputNumber);
		System.out.println();
		
		int outputNumber = 0;
		
		while(inputNumber > 0){
			int mod = inputNumber % 10;
			inputNumber = inputNumber - mod;
			inputNumber = inputNumber / 10;
			
			outputNumber = outputNumber + (int)(mod *(Math.pow(10,(inputLength - 1))));
			inputLength--;
		}
		
			System.out.println("Your reversed number is: " + outputNumber);
			System.out.println("+--------------------------------------+");
	}
}