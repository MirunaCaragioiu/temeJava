public class Student {
	private String sName;
	private short[] marks;
	float avgMark;
	
	public Student(String sName, short[] studentMarks) {
		this.sName=sName;
		this.marks=studentMarks;
	}
	
	public String getSName() {
		return sName;
	}
	public void setSName(String sName) {
		this.sName = sName;
	}
	public short[] getMarks() {
		return marks;
	}
	public void setMarks(short[] marks) {
		this.marks = marks;
	}
	
	public float getAvgMark() {
		this.avgMark=calcAvgMark();
		return this.avgMark;
	}
	
	private float calcAvgMark() {
		float result=0.0f;
		for(int i=0;i<marks.length;i++)
		{
			result+=marks[i];
		}
		result=result/marks.length;
		return result;
	}
	

}
