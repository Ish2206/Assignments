package week3.week3day3;

public class OverridingConcept 
{
	public void startCar()
	{
		System.out.println("Car is started");
	}
	public void applyBrake()
	{
		System.out.println("Brake is applied");
	}
	public void stopCar()
	{
		System.out.println("Car is stopped");
	}
	public static void main(String[] args) 
	{
		OverridingConcept car = new OverridingConcept();
		car.applyBrake();
		car.startCar();
	}
}
