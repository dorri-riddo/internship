package q11;

public class Q11 {
	public static void main(String[] args) {
		InputCal inputCal = new InputCal();
		Calendar calendar = new Calendar(inputCal.inputYear(), inputCal.inputMonth());
		
		calendar.printTitle();
		calendar.printWeek();
		calendar.printCalendar();
	}
}
