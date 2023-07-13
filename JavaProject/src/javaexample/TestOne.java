package javaexample;

public class TestOne {
	

	public static void main(String[] args) {
		
		int matrix [][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		int rm [][]= {{1,2,3},{1,2,3},{1,2,3}};
		
		
		int a=0,b=0,temp=0, i, j;
		
		for(i=matrix.length-1;i>=0;i--)
		{
			temp=i;
			a=0;
			for(j=0;j<matrix[i].length;j++)
			{
				rm[j][b]=matrix[i][j];

			}
			b++;
			
			System.out.println();
		}
		
		for(i=0;i<matrix.length;i++)
		{
			
			for(j=0;j<matrix[i].length;j++)
			{
				System.out.print(rm[i][j]);

			}
			
			System.out.println();
		}
	}

}
