public class Developer {
	private float minutes[];
	private int[] days;
	public Developer(int days[],float minutes[]) 
	{
		this.days=days;
		this.minutes=minutes;
	}
	
	public float[] getMinutes()
	{
		return this.minutes;
	}
	
	public void setDays(int days[])
	{
		this.days=days;
	}
	
	public void setMinutes(float[] minutes)
	{
		this.minutes=minutes;
	}
	
	public float getMax()
	{
		float max=minutes[0];
		
		for(int i=0;i<minutes.length;i++)
			if(max<minutes[i])
			{
				max=minutes[i];
				
			}
		return max;
		
	}
	public float getMin()
	{
		float min=minutes[0];
		
		for(int i=0;i<minutes.length;i++)
			if(minutes[i]<min)
			{
				min=minutes[i];
				
			}
		return min;
		
	}
	public int[] getDaysMin()
	{ int k=0;
		for(int i=0;i<minutes.length;i++)
			if(minutes[i]==getMin())
				{
				  days[k]=i;
				  k++;
	            }
		return days;
	}
	
	public int[] getDaysMax()
	{ int k=0;
		for(int i=0;i<minutes.length;i++)
			if(minutes[i]==getMax())
				{
				days[k]=i;
				k++;
				}
		return days;
	}
}