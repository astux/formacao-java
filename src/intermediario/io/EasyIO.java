package intermediario.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class EasyIO {

	void exemploSimples() throws FileNotFoundException {
		Scanner s = new Scanner(System.in);
		PrintStream ps = new PrintStream("arquivo.txt");
		while (s.hasNextLine()) {
			ps.println(s.nextLine());
		}
	}
}
