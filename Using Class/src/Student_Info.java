
public class Student_Info {
	
	private int roll;
	private String name;
	private String dept;
	public java.util.Date d;
	public void getInfo( String iname,int iroll, String idept)
	{
	
		name=iname;
		roll=iroll;
		dept=idept;
		d=new java.util.Date();
	}
	public void show()
	{
		System.out.println("Student's name is= "+name);
		System.out.println("Student's roll is= "+roll);
		System.out.println("Student's roll is= "+dept);
		System.out.println("Date is= "+d);
	}

}
