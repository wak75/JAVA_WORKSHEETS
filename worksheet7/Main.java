interface shape
{
	void RectangleArea(double length, double beadth);
	void SquareArea(double side);
	void CircularArea(double radius);

}

class area implements shape

{
	double length;
	double breadth;
	double side;
	double radius;
	void RectangleArea(double length, double beadth)
	{
		length = length;
		breadth = breadth;
		System.out.println("The area of rectangle is "+length*breadth);
	}
	void SquareArea(double side)
	{
		side = side;
		System.out.println(" The areaw of the square is "+ side*side );
	}
	void CircularArea(double radius)
	{
		radius = radius;
		{
			System.out.println("The area of circle is "+2*3.14*radius);
		}
	}
}

class Main
{
	public static void main(String[] args) {
		
		shape ar = new area();

		ar.RectangleArea(22,22);
		ar.SquareArea(4);
		ar.CircularArea(5);
	}
}
