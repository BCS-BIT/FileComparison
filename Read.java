import java.io.*;
import java.util.Scanner;

public class Read {

	public static void main(String[] args) {
		try {
			
		FileReader file=new FileReader("/Users/ERICK KATIKIRO/Desktop/Myfile.txt");
		Scanner scan= new Scanner(file);
		FileReader file1=new FileReader("/Users/ERICK KATIKIRO/Desktop/Myfile1.txt");
		Scanner scan1= new Scanner(file1);
		
		
	int i=0;
	int j=0;
	
	while(i!= -1 && j!= -1) {
		i=file.read();
		j=file1.read();
		if(i!=j ) {
			break;
	//System.out.print(+(char) i + + (char) j);
		}
		}
		if(i!=j) {
			System.out.print("They differ");
		}else {
			System.out.print("They are the same");
		}
	
	file.close();
	file1.close();
	} catch(IOException e) {
		System.out.print("Error");
		e.printStackTrace();
	}

}
}

