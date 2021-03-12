public class Class implements Runnable{

	private int[] v1;
	private int[] v2;
	private int startIdx;
	private int stopIdx;
	private Long prod;
	
	public Class(int[] vect1,int[] vect2, int start, int stop)
	{
		this.v1=vect1;
		this.v2=vect2;
		this.startIdx=start;
		this.stopIdx=stop;
	}
	
	@Override
	public void run()
	{
		long p=0;
		for(int idx=this.startIdx;idx<=this.stopIdx;idx++)
		{
			p+=(this.v1[idx]*v2[idx]);
		}
		this.prod= new Long(p);
	}
	
	public Long getProd()
	{
		return this.prod;
	}

}