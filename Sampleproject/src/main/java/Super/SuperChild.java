package Super;

public class SuperChild extends SampleSuper {
	String c="Black";
	public void display()
	{
		System.out.println(super.c);
		System.out.println(c);
	}
	public static void main(String[]args) {
		SuperChild obj=new SuperChild();
		System.out.println(obj.c);
		obj.display();
		
	}

}
