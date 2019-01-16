package iTLClass4A;

public class Mathops {
	double result = 0;
	int result1 = 0;
	
	public double  AddNumbers ( double a, double b)
	{
		result = ( a + b);
	return result;
	}
	
	public double  SubNumbers ( double a, double b)
	{
		result = ( a - b);
	return result;
	}
	
	public double  MulNumbers ( double a, double b)
	{
		result = ( a * b);
	return result;
	}

	public double  DivNumbers ( double a, double b)
	{
		result = ( a / b);
	return result;
	}
	
	public int  FactNumber ( int x)
	{
		int y=x;
		
		for (int i=1;i<=(y-1);i++)
		{
			x=x*i;
		}
	return x;
	}
	
	public static int multiply(int x)
	{
		int mul=1;
		for (int i=1;i<=(x-1);i++ )
		{
			mul = mul*10;
		}
		return mul;
	}
	
	public int  RevNumber ( int l)
	{

		int n=l;
		int m=0;
		int o=0;
		int count=0;
		int result2=0;
		int[] array = new int[10];
		
		for (int i=0;i<99;i++)
		{
			m=(n/10);
			o=(n%10);
			array[i]=o;
			if (m >=10)
			{
				n=m;
			} else
			{
				
				i=i+1;
				count = i;
				array[i]=m;
				i=99;
				count++;
			}
			
		}
		
	   int a=0;
	   int a1=0;
		for (int x1=0;x1<count;x1++)
		{
			a=multiply((count-x1));
			a1 = array[x1]*a;
			result2 = result2+a1;
			
		}
		
		return result2;
	}
	
}


