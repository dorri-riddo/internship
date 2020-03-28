package q17;

public class Split {
	private String[][] strArr;
	private String[][][] token;

	public Split(String[][] strArr) {
		this.strArr = strArr;
	}

	public void splitTokens() {
		token = new String[strArr.length][strArr[0].length][2];
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[0].length; j++) {
				String[] arr = strArr[i][j].split("=");

				token[i][j][0] = arr[0];	
				token[i][j][1] = arr[1];
			}
		}
	}
	
	public String getToken(int i, int j, int k) {
		return token[i][j][k];
	}
}
