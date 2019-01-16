package Class3;

public class overloading {

	public int c;
	public float f;

	public int fun(int a, int b)
	{
		System.out.println("You are getting response from int funtion");
		return  c = (a*b) ;
		
	};
	
	public float fun(float a, float b)
	{
		System.out.println("You are getting response from float funtion");
		return  f = (a*b) ;
		
	};
}
