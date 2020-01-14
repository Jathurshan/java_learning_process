import java.util.Scanner;
class FrogJump{	

	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("+------- Select One -------+");
		System.out.println("|  1. Get Time By Distance |");
		System.out.println("|  2. Get Distance By Time |");
		System.out.println("|  3. Exit                 |");
		System.out.println("+--------------------------+");
		
		System.out.println("Select Any Option");
		int option = scanner.nextInt();
		
		if(option == 1){
			System.out.println("Enter the distance to jump..");
			int distance = scanner.nextInt();
			FrogJump.findTime(distance);
			
		} else if(option == 2){
			System.out.println("Enter the time in seconds to jump..");
			int time  = scanner.nextInt();
			FrogJump.findDistance(time);
			
		} else if(option == 3){
			System.exit(0);
			
		} else {
			System.out.println("Please press any of the option..!!");
		}		
	}
	
	public static void findTime(int distance){
		int time = 0;	
		
		 if (distance <= 5){
			time = 0;
		 } 
		 
		 while(distance > 5){
			if(distance > 0){
				distance = distance - 5;
				if(distance > 0){
					time = time + 1;
				} 		
			}
			if(distance > 0){
				distance = distance - 3;
				if(distance > 0){
					time = time + 2;
				}
			}
			if(distance > 0){
				distance = distance - 1;
				if(distance > 0){
					time = time + 5;
				}
			}
		 }
		System.out.println("Jumping time is " + time + "sec...");
	}
	
	public static void findDistance(int time ){
		
		int distance = 0;
		if(time == 0){
			System.out.println("The jumping distance would be less than 5 meters..!");
			
		} else if(time > 0){
			time =  time - 3;
			
			int value  = time / 8;
			int mod  = time % 8;
			
			if(value >= 1){
				distance  = 9 * value;
			}
			
			if(mod == 5){
				distance = distance + 5;
			} else if(mod == 6 || mod == 7){
				distance = distance + 8;
			} 
			
			distance = distance + 9;
		}
		
		System.out.println("The jumping distance is " + distance);
		
	}
}