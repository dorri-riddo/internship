package q12;

import java.io.*;

public class Q12 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String[] array = new String[n];
		CityState[] cs = new CityState[n];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = bf.readLine();
		}
		bf.close();
		
		Split s = new Split();
		for (int i = 0; i < cs.length; i++) {
			String[] tmp = s.split(array[i]);
			cs[i] = new CityState(tmp[0], tmp[1]);
		}
		
		System.out.format("city\tstate\n");
		for (int i = 0; i < cs.length; i++) {
			System.out.println(cs[i].toString());
		}
	}
}
