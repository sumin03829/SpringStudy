package kr.hs.study.beans;

public class LgTV implements TV{
	private int price;
	private AppleSpeaker speaker;
	

	public LgTV() {
	}

	public LgTV(int price, AppleSpeaker speaker) {
		super();
		this.price = price;
		this.speaker = speaker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String PowerOn() {
		// TODO Auto-generated method stub
		return "Àü¿ø Å´";
	}

	public String PowerDown() {
		// TODO Auto-generated method stub
		return "Àü¿ø ²û";
	}

	public AppleSpeaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(AppleSpeaker speaker) {
		this.speaker = speaker;
	}
	

}
