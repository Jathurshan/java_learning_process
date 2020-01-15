// Generate Multiplication Table for numbers from 1 to 12
class MultiplicationTable{
    public static void main (String [] args){

        int table [][]= new int[13][13];
		
		int i = 1;
		System.out.printf("%8s"," ");
		while(i < 13){
			System.out.printf("%8s", i);
			i++;
		}
		System.out.println();
		System.out.println("      ====================================================================================================");
		
		
        multiplication(table);
        System.out.println();
        //multiplicationTwo(table);
    }
// methid using by for loop
    public static void multiplication(int a[][]){
        for(int i = 1; i < 13; i++){
            for(int j = 1; j < 13; j++){
               a[i][j] = i * j;
            }
        }
        printArray(a);
    }
// method using by while loop
    public static void multiplicationTwo(int a[][]){
        int i = 1;
        int j = 1;
        while(i < 13){
            while(j < 13){
                a[i][j] = i * j;
                j++;
            }
            i++;
        }
        printArray(a);
    }

    public static void printArray(int a[][]){
        for(int i = 1; i < a.length; i++){
			System.out.printf("%8s", i + "|");
            for(int j = 1; j < a.length; j++){
                System.out.printf("%8s",a[i][j]);
            }
            System.out.println();
        }
    }
}