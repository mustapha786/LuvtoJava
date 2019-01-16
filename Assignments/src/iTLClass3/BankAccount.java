package iTLClass3;

public abstract class BankAccount {
    public	String Name;
    public final double savingMin =50;
    public final double CuringMin =10;
	public  int AccNum;
	public double Accbal;
	public int typeOfAct;
	public double Interest;
//	public abstract double deposit(double x);
	public abstract double withdwal(double y);
	public abstract void display();
	public abstract void Set();
	public  double deposit(double x)
	{
		Accbal = Accbal + x;
		return Accbal;
	}
}
