package q12;

public class CityState {
	private String city;
	private String state;
	
	public CityState(String city, String state) {
		this.city = city;
		this.state = state;
	}
	
	@Override
	public String toString() {
		return city + " " + state;
	}
}
