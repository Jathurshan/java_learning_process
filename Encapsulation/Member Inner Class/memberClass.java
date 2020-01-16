class MemberClass{
	
	public void display(){
		String name = "Thanos";
		
		class MemberInnerClass{
			public void print(){
				System.out.println("I am inevitable, I am " + name);
			}
		}
		
		MemberInnerClass memberInnerClass = new MemberInnerClass();
		memberInnerClass.print();
		
	}
	
	public static void main(String [] args){
		MemberClass memberClass = new MemberClass();
		memberClass.display();
	}
}