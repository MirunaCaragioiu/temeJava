public class Serie {
	private Grupa[] groups;
	private String sName;
	private float avgS;
	
	public Serie(Grupa[] groups, String sName) {
		this.groups=groups;
		this.sName=sName;
	}

	public String getSName() {
		return sName;
	}

	public void setSName(String sName) {
		this.sName = sName;
	}
	
	public float getAvgS()
	{
		this.avgS=calcAvgS();
		return this.avgS;
	}
	public float calcAvgS() {
		float result=0.0f;
		for(int i=0;i<groups.length;i++)
			result+=groups[i].getAvgGroup();
		result=result/groups.length;
		return result;
	}
	
	
	
	
	
}