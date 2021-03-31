import java.util.Scanner;

class area
{
	double length=0,breadth=0, height=0;
	area(double a)
	{
		length = a;
		breadth = height = 1;

		System.out.println("area of square= "+ length*length);
	}

	area(double a, double b)
	{
		length=a;
		breadth = b;
		height =1;
		System.out.println("area of rectangle is = "+ length*breadth);
	}

	area(double a, double b, double c)
	{
		length = a;
		breadth = b;
		height = c;
		System.out.println("area of cuboid= "+ length*breadth*height);
	}

}

// class find
// {
// 	public static void main(String[] args) {
// 	 	area a1 = new area(12);
// 	 	area a2 = new area(10,12);
// 	 	area a3 = new area(10,12,16);

// 	 } 
// }
class find
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose the shape you  want to find area: \n1. Square \n2. Rectangle \n3. Cuboid \n");
		int choice = sc.nextInt();

		switch(choice)
		{
			case 1:
			{
				System.out.println("Enter the length of the side of the square: ");
				double side = sc.nextDouble();
				area a1 = new area(side);

				break;
			}

			case 2:
			{
				System.out.println("Enter the length of the rectangle : ");
				double length = sc.nextDouble();
				System.out.println("Enter the breadth of the rectangle : ");
				double breadth = sc.nextDouble();

				area a2 = new area(length, breadth);
				break;
			}

			case 3:
			{
				System.out.println("Enter the length of the cuboid : ");
				double length = sc.nextDouble();
				System.out.println("Enter the breadth of the cuboid : ");
				double breadth = sc.nextDouble();
				System.out.println("Enter the height of the cuboid : ");
				double height = sc.nextDouble();

				area a3 = new area(length, breadth, height);
				break;
			}

			default:
			{
				System.out.println("You have entered an invalid option!! Try again");
				break;
			}


		}

	}
}
