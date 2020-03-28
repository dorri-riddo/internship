package q16;

import java.io.*;

public class Q18 {
	public static void main(String[] args) throws IOException {
		String str = "/* This is a comment\n" + 
				"* that continues\n" + 
				" * across lines\n" + 
				" */\n" + 
				"First line.\n" + 
				"\n" + 
				"/* This is a comment that \n" + 
				"continues across lines */ \n" + 
				"Second Line.\n" + 
				"  // This is a one-line comment \n" + 
				"Third Line.\n" + 
				"\n" + 
				"Fourth Line. // This is a one-line comment.\n" +
				"Fifth /* comment */Line.";
		
		Format.judge(str);
	}
}
