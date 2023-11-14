package week3.week3day3;

public class APIClient 
{
	public void sendRequest(String endPoint)
	{
		System.out.println("The Endpoint is "+ endPoint);
	}
	public void sendRequest(String endPoint, String requestBody, boolean requestStatus)
	{
		System.out.println("The Endpoint is " + endPoint);
		System.out.println("The Request body is " + requestBody);
		System.out.println("The Request Status is " + requestStatus);
	}
	public static void main(String[] args) 
	{
		APIClient api = new APIClient();
		api.sendRequest("server");
		System.out.println("+=================+");
		api.sendRequest("Mobile", "Hi", false);
		
	}
}
