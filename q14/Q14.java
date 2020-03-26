package q14;

public class Q14 {

	public static void main(String[] args) {
		Align a = new Align();
		String msg = "Contents"+ "\n" + 
				"1 Usage" + "\n" +
				"2 Encoding" + "\n" +
				"2.1 Character encodings" + "\n" +
				"2.2 Control codes" + "\n" +
				"3 See also" + "\n";
		
		a.leftAlign(msg);
		System.out.println("======================================================================");
		a.centerAlign(msg);
		System.out.println("=======================================================================");
		a.rightAlign(msg);
	}
}
