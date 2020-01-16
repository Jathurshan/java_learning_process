class Calculation{
	public static void main(String [] args){
		Calculation calculation = new Calculation();
		calculation.division(calculation.printEvenNumber(23));
	}
	
	public int printEvenNumber(int i){
		int sum = 0;
		
		if(i <=0){
			throw new ArithmeticException("Not Valid..!");
		}
		while(i>0){
			if(i % 2 == 0){
				sum = sum + i;
			}
			i--;
		}
		return sum;
	}	
	
	public void division(int number){
		int value = 0;
		try{
			while(number>1){
				number = number / 2;
				System.out.println(number);
				
				if(number == 1){
					value  = number / 0;
				}
			}
			
			int array[] = new int[10];
			array[12] = value;
			
		} catch(ArithmeticException e){
			System.out.println(e);
			
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			
		} catch(Exception e){
			System.out.println(e);
		}
		
		finally{
			System.out.println();
			System.out.println("Whether the exception is handled or not finally block will executes..!");
		}
	}

}