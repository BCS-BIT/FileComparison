import java.io.FileReader;
import java.io.LineNumberReader;

public class Read_File {
	 public static void main(String[] args) throws Exception {
		    LineNumberReader r = new LineNumberReader(new FileReader("/Users/ERICK KATIKIRO/Desktop/Myfile1.txt"));

		    String line = null;

		    while ((line = r.readLine()) != null) {
		      System.out.println(r.getLineNumber() + ": " + line);
		    }
		    r.close();
		  }

}
