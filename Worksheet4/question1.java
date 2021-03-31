class first
{
	public static int count = 0;

	public first()
	{
		count++;
	}
}

class second
{
	public static void main(String[] args) {
		
		System.out.println("Before creating the object = " + first.count);

		first n = new first();
		first n2 = new first();

		System.out.println("After creating the objects = " + first.count);
	}
}