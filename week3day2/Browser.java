package week3.week3day2;

public class Browser 
{
	public static void main(String[] args) 
	{
		System.out.println("Chrome Browser");
		System.out.println("--------------");
		Chrome chrome = new Chrome();
		chrome.openIncognito();
		chrome.openURL();
		chrome.clearCache();
		chrome.closeBrowser();
		chrome.navigateBack();
		System.out.println("-----------------------------------");
		System.out.println("Edge Browser");
		System.out.println("--------------");
		Edge edge = new Edge();
		edge.openURL();
		edge.takeSnap();
		edge.clearCookies();
		edge.closeBrowser();
		edge.navigateBack();
		System.out.println("-----------------------------------");
		System.out.println("Safari Browser");
		System.out.println("--------------");
		Safari safari = new Safari();
		safari.openURL();
		safari.readerMode();
		safari.fullScreenMode();
		safari.closeBrowser();
		safari.navigateBack();
	}
		float browserVersion = 2.0f;
		String browserName;
	
	public void openURL()
	{
		System.out.println("Open the URL");
	}
	public void closeBrowser()
	{
		System.out.println("Close the Browser");
	}
	public void navigateBack()
	{
		System.out.println("Navigate Back");
	}
}
