import java.util.Scanner;
class ReverseNumber{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your input number..!");
		int inputNumber = scanner.nextInt();
		
		System.out.println();
		System.out.println("+--------------------------------------+");
		System.out.println("Your input number is : " + inputNumber);
		System.out.println();
		System.out.print("Your reversed number is : ");
		
		while(inputNumber > 0){
			int mod = inputNumber % 10;
			inputNumber = inputNumber - mod;
			inputNumber = inputNumber / 10; 
			System.out.print(mod);		
		}
		
		System.out.println();
		System.out.println("+--------------------------------------+");
	}
}