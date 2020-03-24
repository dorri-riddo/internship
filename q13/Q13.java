package q13;

import java.io.*;

public class Q13 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = 4;
		String str = "";
		while(n-- > 0) {
			str += bf.readLine();
			str += "\n";
		}
		bf.close();
		
		Format f = new Format();
		System.out.print(f.parse(str));
	}
}
