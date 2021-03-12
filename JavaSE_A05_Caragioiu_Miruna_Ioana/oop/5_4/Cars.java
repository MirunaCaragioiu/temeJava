
public class Cars {
	private float[] km;
	float avg;
	//private int days;
	
	public Cars(float[] km) {
		this.km=km;
	}

	public float[] getKm() {
		return km;
	}

	public void setKm(float[] km) {
		this.km = km;
	}
	
	public float getAvg() {
		float sum=0.0f;
		for(int i=0;i<km.length;i++)
			sum+=km[i];
		return sum/km.length;
	}
	
	public float getMax()
	{
		float max=km[0];
		
		for(int i=0;i<km.length;i++)
			if(max<km[i])
			{
				max=km[i];
				
			}
		return max;
		
	}
	public float getMin()
	{
		float min=km[0];
		
		for(int i=0;i<km.length;i++)
			if(km[i]<min)
			{
				min=km[i];
				
			}
		return min;
		
	}
}
