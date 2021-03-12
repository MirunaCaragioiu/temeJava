public class Class implements Runnable {
	private int[] v1;
	private int[] v2;
	private int startIdx;
	private int stopIdx;
	private int[] sum=new int[10_000_000];
	

	public Class(int[] vect1,int[] vect2, int start,int stop)
	{
		this.v1=vect1;
		this.v2=vect2;
		this.startIdx=start;
		this.stopIdx=stop;
	}
	
	
  @Override
  public void run()
  {
	  int[] s=new int[v1.length];
		for(int i=0;i<s.length;i++)
			  s[i]=0;
	  for(int idx=this.startIdx;idx<=this.stopIdx;idx++) {
		  s[idx]=this.v1[idx]+this.v2[idx];
	  }
	  for(int i=this.startIdx;i<=this.stopIdx;i++)
		  this.sum[i]= s[i];
	  
  }
  
  public int[] getSum()
  {
	  return sum;
  }
}
