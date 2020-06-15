public class Sample1 {
	int a=10;
	int b=20;
	

	
	Sample1()
	{
		System.out.println("printing");
	}
	public int swap()
	{
		//a=20 and b=10
		
		b=b-a;// 10
		
		System.out.println("value of b is" +b);
		a=b+a;
		System.out.println("value of a is" +a);
		
		return a;
	}
	
	public static void main(String[] args) {
		Sample1 s = new Sample1();
		s.swap();
	}
}
