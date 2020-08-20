package Abstract;

	

	abstract class Dog{
		
		public void bark() {
			System.out.println("the dog barks");
		}
	//public abstract void poop();
	}
	
	
	 class Ab extends Dog  {
		
		 public void poop() {
			 System.out.println("the dog poop's");
		 }
		
	}

	 public class AbstractTutor {
	public static void main(String[] args) {
		
		Ab a = new Ab();
		a.bark();
		a.poop();

	}
}

	
