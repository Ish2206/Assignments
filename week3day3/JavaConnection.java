package week3.week3day3;

public class JavaConnection implements DataBaseConnection
{

	@Override
	public void connect() 
	{
		System.out.println("The database is connected");
	}

	@Override
	public void disconnect() 
	{
		System.out.println("The database is disconnected");
	}

	@Override
	public void executeUpdate() 
	{
		System.out.println("Execution update");
	}
	public static void main(String[] args) 
	{
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.executeUpdate();
		jc.disconnect();
	}
	

}
