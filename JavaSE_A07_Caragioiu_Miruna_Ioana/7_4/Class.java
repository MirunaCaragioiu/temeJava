public class Class implements Runnable {
	
	
	private int startIDx;
	private int stopIdx;
	private int[] sum; 
	private Matrix v;
	
	public Class(Matrix matrix, int start,int stop)
	{
		this.v=matrix;
		this.startIDx=start;
		this.stopIdx=stop;
	}
	
  @Override
  public void run()
  {int[] s=new int[v.linii];
	  for(int idx=this.startIDx;idx<=this.stopIdx;idx++)
	  {
		  s=Matrix.addLine(v);
	  }
	  
	  this.sum=s;
	  
	  
  }
  
  public int[] getSum()
  {
	  return this.sum;
  }
}

