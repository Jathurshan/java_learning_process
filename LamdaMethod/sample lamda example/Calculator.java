//Traditional approach...
interface Calculator{
	public int power(int x);
}

class Calculation{
	public static void main(String [] args){
		Calculator calculator = new Calculator(){
			public int power(int x){
				return x*x;	
			}
		};
		calculator.power(2);
	}
}