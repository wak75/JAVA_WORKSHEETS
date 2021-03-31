class students
{
	int id;
	String name;

	students(int a, String b)
	{
		id = a;
		name =b;
        System.out.println("This is the first constructor\n\n");
	}

	students(students s)
	{
		id=s.id;
		name=s.name;

		System.out.println("This is Students constructor 2 and it doest have any intilized data");
		System.out.println("id= "+ id +"\n" + "name = "+ name);

	}
}

class copy
{
	public static void main(String[] args) {
		students s1 = new students(1,"wak");
		students s2 = new students(s1);
		


	}
}
