//Calculation using lamda method
interface Calculator{
	int power(int x);
}

class Calculation{
	public static void main(String [] args){
		Calculator calculator = (x) -> x*x;
		
		System.out.println(calculator.power(3));
	}
}