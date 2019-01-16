package class4;

public class RealEstate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		CommType Comm_type [] = CommType.values();
		ResType Res_type [] = ResType.values();
		int Comm_type_p [][] = {{101,3200,4,2,100000},{102,4300,3,1,110000},{103,3200,4,2,120000},{104,5200,4,2,130000}};
		int Res_type_p [][] =  {{201,1200,4,2,50000},{202,1300,3,1,60000},{203,1200,4,2,70000},{204,1200,4,2,80000}};
		System.out.println("Commercial Types of Real Estates are :");
		for (CommType a :Comm_type)
		{
		 i=i+1;
		System.out.println(i +":" + a);
	
		}
		System.out.println("Commercial Types of Real Estates Details :");
		for (int j=0;j<4;j++)
		{
			System.out.println();
			System.out.println("Building Number:" + Comm_type_p [j][0]);
			System.out.println("Area:" + Comm_type_p [j][1]);
			System.out.println("Numbers of Rooms:" + Comm_type_p [j][2]);
			System.out.println("Numbers of Floors:" + Comm_type_p [j][3]);
			System.out.println("Price in USD($):" + Comm_type_p [j][4]);
		}
		i=0;
		System.out.println();
		System.out.println("Residential Types of Real Estates are :");
		for (ResType a :Res_type)
		{
		 i=i+1;
		System.out.println(i +":" + a);
	
		}
		
		System.out.println("Residentials Types of Real Estates Details :");
		for (int j=0;j<4;j++)
		{
			System.out.println();
			System.out.println("Building Number:" + Res_type_p [j][0]);
			System.out.println("Area:" + Res_type_p [j][1]);
			System.out.println("Numbers of Rooms:" + Res_type_p [j][2]);
			System.out.println("Numbers of Floors:" + Res_type_p [j][3]);
			System.out.println("Price in USD($):" + Res_type_p [j][4]);
		}
		
		
		
	
	}
	
	

}
