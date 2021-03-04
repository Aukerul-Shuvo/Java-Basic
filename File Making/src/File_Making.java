import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class File_Making {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File ("File_Name.txt");
		if(!file.exists())
		{
			try {
				file.createNewFile();
			 
		
	java.io.PrintWriter pw = new PrintWriter(file);
			pw.println("Hi!\n This is SHUVO from the file!");
			pw.println(1000000);
			pw.close();
			System.out.println("Done!");
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

} }
