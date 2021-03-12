public class ProgMain7_4 {
public static void main(String[] args)
{
	int linii=5;
	int coloane=5;
	int[][] info=new int[linii][coloane];
		for(int i=0;i<linii;i++)
			for(int j=0;j<coloane;j++)
				info[i][j]=2;
	Matrix matrix = new Matrix(linii, coloane, info);
	
	int startIdx=0,stopIdx=0;
	int NTH=2;
	long startT=0,stopT=0; //start time, stop time
	int[] vectSum=new int[NTH];
	int[] a=Matrix.addLine(matrix);
	
	
	  for(int i=0;i<matrix.linii;i++)
		  a[i]=0;
	startT=System.currentTimeMillis();
	
	Thread[] vectTh=new Thread[NTH];
	
	Class[] vectRTh = new Class[NTH];
	
	for(int it=0;it<NTH;it++)
	{
		startIdx=it*(linii*coloane/NTH);
		stopIdx=(it+1)*(linii*coloane/NTH)-1;
		vectSum[it]=0; 
		vectRTh[it]=new Class(matrix,startIdx,stopIdx);
		vectTh[it]=new Thread(vectRTh[it]);
	}
	
	
		for(int it=0;it<NTH;it++)
		{vectTh[it].start();}
		
		
		for(int it=0;it<NTH;it++)
		{
			try{
				vectTh[it].join(); 
				
				} catch(InterruptedException ie)
			{ie.printStackTrace();}
		}
		
		
		for(int it=0;it<NTH;it++)
		{ a = vectRTh[it].getSum();}
		
		
	
	stopT=System.currentTimeMillis();
	System.out.println("multith = "+(stopT-startT));
	for(int i=0;i<matrix.linii;i++)
			System.out.printf("\nsum =%d",a[i]);
}
}
