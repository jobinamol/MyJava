package Super;

public class SuperChild1 extends SuperParent{
	public void displaychild()
	{
		System.out.println("Super class method");
//		super.display();
//		super.displayParent(10, 30);
		this.displayChild();
	}
	public void displayChild()
	{
		System.out.println("this is child class11");
		super.display();
	}
	public static void main(String[]args)
	{
		SuperChild1 obj=new SuperChild1();
//		obj.display();
		obj.displaychild();
	
	}

}