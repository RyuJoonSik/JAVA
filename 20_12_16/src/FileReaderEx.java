import java.io.*;

public class FileReaderEx {

	public FileReaderEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader in = null;
		try {
			in = new FileReader("c:\\windows\system.ini");
			int c;
			while ((c = in.read()) != -1) {
				System.out.println((char) c);
			}
			in.close();
		} catch (IOException e) {
			System.out.println("입출력 불가");
		}
	}

}
