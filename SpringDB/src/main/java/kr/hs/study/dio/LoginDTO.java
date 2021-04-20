package kr.hs.study.dio;

public class LoginDTO {
	private String userID;
	private int userPass;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public int getUserPass() {
		return userPass;
	}
	public void setUserPass(int userPass) {
		this.userPass = userPass;
	}
	
}
