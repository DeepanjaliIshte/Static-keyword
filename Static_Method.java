
public class Static_Method {
	static void display() {
		System.out.println("1");
	}
	public static void main(String[] args) 
	{
		display();
		XYZ.show();
	}
}
class XYZ 
{
	static void show() {
		System.out.println("2");
	}
}