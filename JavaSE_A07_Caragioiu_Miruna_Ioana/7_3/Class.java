public class Class implements Runnable {
	private int[][] v1;
	private int[][] v2;
	private int startIdx;
	private int stopIdx;
	private int[][] sum=new int[10][10];

	public Class(int[][] vect1,int[][] vect2, int start,int stop)
	{
		this.v1=vect1;
		this.v2=vect2;
		this.startIdx=start;
		this.stopIdx=stop;
	}
	
  @Override
  public void run()
  {
	  int[][] s=new int[v1.length][v1.length];
	  for(int i=0;i<s.length;i++) 
		  for(int j=0;j<s.length;j++)
			  s[i][j]=0;
	  
	  for(int i=this.startIdx;i<=this.stopIdx;i++) 
		  for(int j=this.startIdx;j<=this.stopIdx;j++)
			  s[i][j]=this.v1[i][j]+this.v2[i][j];
	
	  for(int i=0;i<v1.length;i++)
		 for(int j=0;j<v1.length;j++)
			  this.sum[i][j]=s[i][j];
	  
  }
  
  public int[][] getSum()
  {
	  return this.sum;
  }
}
