
class printing
{
	int add(int a, int b)
	{
		return a+b;
	}

	double add(double a, double b)
	{
		return a+b;
	}
	
	String add(String a, String b)
	{
		String x= a;
		String y=b;
		String final_a = String.format(x+y);
		return final_a;
	}

}

class printing_answer
{
	public static void main(String[] args) {
	
	printing pr = new printing();
	

	String answer1 = pr.add("hello","world");
	int answer2 = pr.add(10,25);
	double answer3 = pr.add(25.44,69.51);

	System.out.println(answer1);
	System.out.println(answer2);
	System.out.println(answer3);

	} 
}