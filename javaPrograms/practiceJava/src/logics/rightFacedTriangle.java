package logics;

public class rightFacedTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row=5;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=(row-1);j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}

	}

}
