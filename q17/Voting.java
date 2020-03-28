package q17;

public class Voting {
	private String division;
	private String name;
	private int population;
	private String address;
	private String votingDate;
	private int votingNumber;
	private String votingName;
	private String complete;
	
	public String getComplete() {
		return complete;
	}

	public void setComplete(String complete) {
		this.complete = complete;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getVotingDate() {
		return votingDate;
	}

	public void setVotingDate(String votingDate) {
		this.votingDate = votingDate;
	}

	public int getVotingNumber() {
		return votingNumber;
	}

	public void setVotingNumber(int votingNumber) {
		this.votingNumber = votingNumber;
	}

	public String getVotingName() {
		return votingName;
	}

	public void setVotingName(String votingName) {
		this.votingName = votingName;
	}
	
	private String getFormatNumber(int num) {
		String formatNumber = String.format("%,d", num);
		return formatNumber;
	}	
	
	@Override
	public String toString() {
		String msg = division + "\t" + name + "\t" + getFormatNumber(population) + "\t" + address + "\t" + votingDate + "\t" + getFormatNumber(votingNumber) + "\t" + votingName + "\t" + complete;
		return msg;
	}
}
