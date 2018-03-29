import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class DocFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileOutputStream fis = new FileOutputStream("C:\\text.txt");
	InputStreamReader isr = new InputStreamReader(fis);
	BufferedReader br = new BufferedReader(isr);
	StringBuilder sb = new StringBuilder();
	String line = br.readLine();
		while(line!= null)
		{
			sb.append(line);
			sb.append("\n");
			line = br.readLine();
	
		}
		System.out.println(sb.toString());
		
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
