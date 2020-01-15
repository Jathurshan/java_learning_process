import java.util.Scanner;
public class Diamond{
	
    public static void main(String [] args){
        int blank = 1;
		
        System.out.println("Enter the number of row you want to print: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
		
        blank = n - 1;
		
		
        for (int j = 1; j <= n; j++){
            for (int i = 1; i <= blank; i++){
                System.out.print(" ");
            }
            blank--;
			
            for (int i = 1; i <= 2 * j - 1; i++){
                System.out.print("*");                
            }
            System.out.println("");
        }
		
        blank = 1;
        for (int j = 1; j <= n - 1; j++){
            for (int i = 1; i <= blank; i++){
                System.out.print(" ");
            }
            blank++;
			
            for (int i = 1; i <= 2 * (n - j) - 1; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}