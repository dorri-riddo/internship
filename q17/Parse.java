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

				if (key.equals("����")) {
					voting.setDivision(value);
				} else if (key.equals("�̸�")) {
					voting.setName(value);
				} else if (key.equals("�����")) {
					voting.setPopulation(Integer.parseInt(value));
				} else if (key.equals("�ּ�")) {
					voting.setAddress(value);
				} else if (key.equals("��ǥ��¥")) {
					voting.setVotingDate(value);
				} else if (key.equals("�����μ�")) {
					voting.setVotingNumber(Integer.parseInt(value));
				} else {
					voting.setVotingName(value);
				}
			}
			voting.setComplete(getVotingComplete(voting.getVotingDate()));
			if (isBungee(voting.getAddress()))
				voting.setAddress("����� ���ʱ� ���μ�ȯ�� 2201");
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
			return "��ǥ�Ϸ�";
		} else if (compare < 0)
			return "��ǥ����";
		else
			return "��ǥ ��";
	}

	private boolean isBungee(String address) {
		if (address.indexOf("����") != -1)
			return true;
		return false;

	}
}
