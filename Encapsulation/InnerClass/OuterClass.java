class OuterClass{
	String name = "Ultron";
	private class InnerClass{
		public void print(){
			System.out.println("My name is: " + name);
		}
	}
	
	public void show(){
		InnerClass inner = new InnerClass();
		inner.print();
	}
}
