
public class ParkingPlace {
	private int nrCars;
	private float[] nrMin;
	
	public ParkingPlace(int nrCars, float[] nrMin) {
		this.nrCars=nrCars;
		this.nrMin=nrMin;
	}

	public int getNrCars() {
		return nrCars;
	}

	public void setNrCars(int nrCars) {
		this.nrCars = nrCars;
	}

	public float[] getNrMin() {
		return nrMin;
	}

	public void setNrMin(float[] nrMin) {
		this.nrMin = nrMin;
	}
	
	
	public float getMax()
	{
		float max=nrMin[0];
		
		for(int i=0;i<nrCars;i++)
			if(max<nrMin[i])
				max=nrMin[i];
		return max;
	}
	
	public float getMin()
	{
		float min=nrMin[0];
		
		for(int i=0;i<nrCars;i++)
			if(nrMin[i]<min)
				min=nrMin[i];
		return min;
	}

}
