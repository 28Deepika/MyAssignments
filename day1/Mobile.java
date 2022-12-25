package week1.day1;

public class Mobile {
	
	
public void makeCall() {
  
	String mobileModel = "Oneplus";
	float mobileWeight=100f;
	
	System.out.println(mobileModel);
	System.out.println(mobileWeight);
	System.out.println("Call anyone from contact");

}
public void sendMessage() {
	boolean FullCharged = true;
	int mobileCost=30000;
	System.out.println(FullCharged);
	System.out.println(mobileCost);
	
	System.out.println("Send message from contact");

}
	public static void main(String[] args) {
		
Mobile mbl = new Mobile();
mbl.makeCall();
mbl.sendMessage();

System.out.println("This is my mobile");

	}
	
}

