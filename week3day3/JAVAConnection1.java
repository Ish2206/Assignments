package week3.week3day3;

public class JAVAConnection1 extends MySQLConnection
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
		JAVAConnection1 jc1 = new JAVAConnection1();
		jc1.connect();
		jc1.executequery();
		jc1.executeUpdate();
		jc1.disconnect();
	}

}
