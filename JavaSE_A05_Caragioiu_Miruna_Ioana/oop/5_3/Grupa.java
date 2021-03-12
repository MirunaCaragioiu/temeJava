public class Grupa {
	private int noGroup;
	private float avgGroup;
	private Student[] students;
	
	public Grupa(int noGroup, Student[] students)
	{
		this.noGroup=noGroup;
		this.students=students;
	}
	
	public int getNoGroup() {
		return noGroup;
	}
	public float getAvgGroup() {
		this.avgGroup=calcAvgGroup();
		return this.avgGroup;
	}
	
	private float calcAvgGroup() {
	   float result=0.0f;
	   for(int i=0;i<students.length;i++)
	      { 
		     result+=students[i].getAvgMark();
	      }
	   result= result/students.length;
	   return result;
	}
}
