package q17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Parse {
	private String[][] data;
	private ArrayList<Voting> votingList;

	public Parse(String[][] data) {
		this.data = data;
	}

	private boolean isHundred(int num) {
		if (num > 100)
			return true;
		return false;
	}

	public void parseData() throws ParseException {
		Split split = new Split(data);
		split.splitTokens();
		votingList = new ArrayList<Voting>();
		for (int i = 0; i < data.length; i++) {
			Voting voting = new Voting();
			for (int j = 0; j < data[0].length; j++) {
				String key = split.getToken(i, j, 0);
				String value = split.getToken(i, j, 1);

				if (key.equals("구분")) {
					voting.setDivision(value);
				} else if (key.equals("이름")) {
					voting.setName(value);
				} else if (key.equals("세대수")) {
					voting.setPopulation(Integer.parseInt(value));
				} else if (key.equals("주소")) {
					voting.setAddress(value);
				} else if (key.equals("투표날짜")) {
					voting.setVotingDate(value);
				} else if (key.equals("선거인수")) {
					voting.setVotingNumber(Integer.parseInt(value));
				} else {
					voting.setVotingName(value);
				}
			}
			voting.setComplete(getVotingComplete(voting.getVotingDate()));
			if (isBungee(voting.getAddress()))
				voting.setAddress("서울시 서초구 남부순환로 2201");
			votingList.add(voting);
		}
	}

	public void print() {
		for (Voting v : votingList) {
			if (isHundred(v.getPopulation())) {
				System.out.println(v.toString());
			}
		}
	}

	private String getVotingComplete(String date) throws ParseException {
		Date today = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sf.parse(date);

		int compare = today.compareTo(d);

		if (compare > 0) {
			return "투표완료";
		} else if (compare < 0)
			return "투표예정";
		else
			return "투표 중";
	}

	private boolean isBungee(String address) {
		if (address.indexOf("번지") != -1)
			return true;
		return false;

	}
}
