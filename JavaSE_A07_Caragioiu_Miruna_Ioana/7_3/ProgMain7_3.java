
public class ProgMain7_3 {
	
	private static final int NTH=2; 
	public static void main(String[] args) {
		int dimV=10;
		int[][] v1=new int[dimV][dimV];
		int[][] v2=new int[dimV][dimV];
		int[][] sum = new int[dimV][dimV]; 
		
		for(int i=0;i<dimV;i++)
			for(int j=0;j<dimV;j++)
				sum[i][j]=0;
		for(int i=0;i<dimV;i++)
			for(int j=0;j<dimV;j++)
				v1[i][j]=2;
		for(int i=0;i<dimV;i++)
			for(int j=0;j<dimV;j++)
				v2[i][j]=3;
		
		int startIdx=0,stopIdx=0;
		long startT=0,stopT=0; 
		
		sum = new int[dimV][dimV];
		for(int i=0;i<dimV;i++)
			for(int j=0;j<dimV;j++)
				sum[i][j]=0;
		startT=System.currentTimeMillis();
		
		Thread[] vectTh=new Thread[NTH];
		
		Class[][] vectRTh = new Class[NTH][NTH];
		
		for (int it=0;it<NTH;it++)
		{
			startIdx=it*(dimV/NTH);
			stopIdx=(it+1)*(dimV/NTH)-1;
			vectRTh[it][it]= new Class(v1,v2,startIdx, stopIdx);
			vectTh[it]=new Thread(vectRTh[it][it]);
		}
		
		
		for(int it=0;it<NTH;it++)
		{
			vectTh[it].start();
		}	
			
		for(int it=0;it<NTH;it++)
		{
			try{
				vectTh[it].join(); 
				} catch(InterruptedException ie)
					{
						ie.printStackTrace();
					}
		}
				
		for(int it=0;it<NTH;it++)
		{ 
			sum=vectRTh[it][it].getSum();
		}
		
		stopT=System.currentTimeMillis();
		
		System.out.println("1. multith = "+(stopT-startT)+" , sum= ");
		for(int i=0;i<dimV;i++)
		{
			for(int j=0;j<dimV;j++)
				System.out.print(sum[i][j]+ " ");
			System.out.println("");
		}
		
	}
}
