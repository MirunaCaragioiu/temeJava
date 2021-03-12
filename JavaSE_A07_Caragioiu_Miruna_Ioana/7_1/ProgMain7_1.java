
public class ProgMain7_1 {
	
	private static final int NTH=2; 
	public static void main(String[] args) {
		int dimV=10;
		int[] v1=new int[dimV];
		int[] v2=new int[dimV];
		int[] sum = new int[dimV]; 
		
		for(int i=0;i<dimV;i++)
			sum[i]=0;
		for(int i=0;i<dimV;i++)
			v1[i]=2;
		for(int i=0;i<dimV;i++)
			v2[i]=3;
		
		int startIdx=0,stopIdx=0;
		long startT=0,stopT=0; 
		Long[] vectSum = new Long[NTH];
		sum = new int[dimV]; 
		for(int i=0;i<dimV;i++)
			sum[i]=0;
		
		startT=System.currentTimeMillis();
		
		Thread[] vectTh=new Thread[NTH];
		Class[] vectRTh = new Class[NTH];
		
		for (int it=0;it<NTH;it++)
		{
			startIdx=it*(dimV/NTH);
			stopIdx=(it+1)*(dimV/NTH)-1;
			vectSum[it]=new Long(0);
			vectRTh[it]= new Class(v1,v2,startIdx, stopIdx);
			vectTh[it]=new Thread(vectRTh[it]);
		}
		
		
		for(int it=0;it<NTH;it++)
		{
			vectTh[it].start();
		}	
			
		for (int it=0;it<NTH;it++)
		{
			try {
			vectTh[it].join();
			}catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
				
		for(int it=0;it<NTH;it++)
		{ 
			sum=vectRTh[it].getSum();
		}
		
		stopT=System.currentTimeMillis();
		
		System.out.println("1. multith = "+(stopT-startT)+" , sum= ");
		for(int i=0;i<dimV;i++)
			System.out.print(sum[i]+ " ");
		
	}
}
