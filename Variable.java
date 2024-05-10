
public class Variable {
	int empid;
	String name;
	static String company="Google";
	public Variable(int empid,String name) 
	{
		// TODO Auto-generated constructor stub
		this.empid=empid;
		this.name=name;
	}
	void display()
	{
		System.out.println(empid+" "+ name+ " "+company);;
	}
	public static void main(String[] args) {
		Variable e=new Variable(101,"Deepanjali");
		e.display();
		Variable e1=new Variable(102, "Deepa");
		e1.display();
		
	}

}
