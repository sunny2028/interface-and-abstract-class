package interfaces;

public class cat implements animals {

	@Override
	public void speak() {
		System.out.println("MEOw");
		
	}

	@Override
	public void eat() {
		System.out.println("MILk");		
	}

}
