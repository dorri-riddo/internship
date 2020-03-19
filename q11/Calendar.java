package q11;

public class Calendar {
	private int year;
	private int month;
	private int[] mDaysArr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public Calendar(int year, int month) {
		this.year = year;
		this.month = month;
	}

	private boolean isLeapYear(int year) {
		if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
			return true;
		}
		return false;
	}

	private int getDays() {
		int days = 0;
		for (int i = 1; i < year; i++) {
			if (isLeapYear(i))
				days += 366;
			else
				days += 365;
		}
		for (int i = 0; i < month - 1; i++) {
			days += mDaysArr[i];
		}
		days++;

		return days;
	}

	public void printCalendar() {
		int week = getDays() % 7;
		if (isLeapYear(year))
			mDaysArr[1] = 29;
		for (int i = 0; i < week; i++)
			System.out.format("%3s", "  ");

		for (int i = 1; i <= mDaysArr[month - 1]; i++) {
			System.out.format("%3d", i);
			week++;
			if (week == 7) {
				System.out.print("\n");
				week = 0;
			}
		}
	}

	public void printTitle() {
		System.out.print("\n");
		System.out.format("%7s", " ");
		System.out.print(year + "년 " + month + "월" + "\n");
	}

	public void printWeek() {
		char[] weekArr = {'일', '월', '화', '수', '목', '금', '토'};
		for (char i : weekArr)
			System.out.format("%4s", i);
		System.out.print("\n");
	}
}
