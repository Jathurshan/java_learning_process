abstract class AnonymousInner{
	public abstract void print();
}

public class OuterClass{
	public static void main(String [] args){
		AnonymousInner inner = new AnonymousInner(){
			public void print(){
				System.out.println("Wow Congratz...!");
			}
		};
		inner.print();
	}
}