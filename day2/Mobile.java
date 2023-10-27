package week1.day2;

public class Mobile 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Mobile details = new Mobile();
		details.makeCall();
		details.sendMsg();
		System.out.println("This is my Mobile");

	}
	public void makeCall()
	{
		String mobileModel = "SAMSUNG";
		float mobileWeight = 480.5f;
		System.out.println("Mobile Model : "+mobileModel);
		System.out.println("Mobile Weight : "+mobileWeight);
	}
	public void sendMsg()
	{
		boolean isFullCharged = true;
		int mobileCost = 12999;
		System.out.println("Is fully charged? "+isFullCharged);
		System.out.println("Mobile Cost : "+mobileCost);
	}
	
}
