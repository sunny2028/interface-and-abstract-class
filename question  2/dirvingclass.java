
public class dirvingclass {
public static void main(String args[])
{
	animals obj=new implementation();
	obj.eat();
	obj.speak();
	animals objj=new animals()
			{

				@Override
				public void eat() {
				System.out.println("original is called");
					
				}
		
			};
			objj.eat();
}
}
