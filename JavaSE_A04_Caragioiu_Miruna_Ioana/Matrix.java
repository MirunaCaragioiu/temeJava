import java.util.Scanner;

public class Matrix {
	private int l;
	private int c;
	private int matrix[][];
	
	public Matrix(int linii, int coloane)
	{
		this.l=linii;
		this.c=coloane;
		matrix=new int[l][c];
		for(int i=0;i<l;i++)
			for(int j=0;j<c;j++)
				matrix[i][j]=0;
	}
	
	public void printMatrix()
	{
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) 
				System.out.print(matrix[i][j] + "\t");
			System.out.println();
		}
		
	}
	
	public int maxMatrix()
	{
		int max=0;
		for(int i=0;i<l;i++)
			for(int j=0;j<c;j++)
				if(matrix[i][j]>max)
					max=matrix[i][j];
		return max;
	}
	
	public void initMatrix()
	{	
		for(int i=0;i<l;i++)
		   for(int j=0;j<c;j++){	
			   @SuppressWarnings("resource")
			   Scanner input=new Scanner(System.in);
		       System.out.print("matrix[" + i+ "][" + j + "]= ");
		       int status=input.nextInt();
		       matrix[i][j]=status;
		   }
	}
}
