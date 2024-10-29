package interfaces;

interface DefaultDemo {
	default void show()
	{
		System.out.println("default");
	}
	public static void main(String[] args) {
		System.out.println("hi");
	}
}
interface J
{
	default void show()
	{
		System.out.println("J");
	}
}
class A 
{
public void show()
{
	System.out.println("A");
}
}
class C extends A implements DefaultDemo
{
	public static void main(String[] args) {
		C obj=new C();
		obj.show();
	}
}

