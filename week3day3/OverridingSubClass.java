package week3.week3day3;

public class OverridingSubClass extends OverridingConcept
{

	public static void main(String[] args) 
	{
		OverridingSubClass sc = new OverridingSubClass();
		sc.startCar();
		sc.applyBrake();
		sc.stopCar();
	}
	public void applyBrake() 
	{
		System.out.println("Brake is not applied");
	}
	public void stopCar()
	{
		System.out.println("Car is not stopped");
	}
}
