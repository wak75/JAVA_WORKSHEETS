import java.util.Scanner;
class vehicle
{
	int year;
	String model;
	void car(int year, String model)
	{
		this.year =year;
		this.model = model;
	}
}
class maruti extends vehicle
{
	
	String type;
	double price;
	

	void cars(String model, String type, int year, double price)
	{
		super.year =year;
		super.model = model;
		this.type=type;
		this.price=price;
	}

	void display()
	{
		System.out.println("Model \t Type \t Year \t Price");
		System.out.println(model+"\t " + type +"\t "+ year +"\t " + price);
	}
}

class actual
{
	public static void main(String[] args) {
		
		int year;
		String type;
		String model;
		double price;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the model of the car");
		model=sc.nextLine();

		System.out.println("Enter the type of the car: ");
		type = sc.nextLine();

		System.out.println("Enter the year of the car: ");
		year = sc.nextInt();

		System.out.println("Enter the price of the car: ");
		price = sc.nextDouble();

		maruti m = new maruti();
		m.cars(model, type, year, price);
		m.display();

	}
}