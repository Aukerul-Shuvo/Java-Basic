import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Student_Info ob1=new Student_Info();
		
		
		String iname=sc.nextLine();
		int iroll=sc.nextInt();
		//String id=sc.nextLine();
		String idept=sc.next();
		
		ob1.getInfo(iname,iroll, idept);
		ob1.show();
	}

}
