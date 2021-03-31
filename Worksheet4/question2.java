import java.util.Scanner;
class cube
{
	public static double num;

	public static void printnum()
	{
		System.out.println("The cube of the given number is " + num*num*num);
	}
}

class findcube
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		cube c =new cube();
		System.out.println("Enter the number ");
		double value = sc.nextDouble();

		cube.num=value;

		cube.printnum();
	}
}