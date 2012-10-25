package intermediario.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Inputs {

	void exemploInputStream() throws IOException {
		InputStream is = new FileInputStream("arquivo.txt");
		int b = is.read();
	}
	
	void exemploBuffered() throws IOException{
		InputStream is = new FileInputStream("arquivo.txt"); //System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();

		while(s != null){
			System.out.println(s);
			s = br.readLine();
		}
		br.close();
	}
	
	public static void main(String[] args) throws IOException {
		new Inputs().exemploBuffered();
	}
}
