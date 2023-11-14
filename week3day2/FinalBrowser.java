package week3.week3day2;

public class FinalBrowser 
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
}
