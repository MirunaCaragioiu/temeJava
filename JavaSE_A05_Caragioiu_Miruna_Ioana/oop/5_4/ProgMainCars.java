
public class ProgMainCars {

	public static void main(String[] args) {
		Cars c1=new Cars(new float[] {120,50,32,78});
		Cars c2=new Cars(new float[] {154,150,74,35});
		System.out.println("Average:  "+c1.getAvg()+" Max:  "+c1.getMax() +" Min:  "+c1.getMin());
		System.out.println("Average:  "+c2.getAvg()+" Max:  "+c2.getMax() +" Min:  "+c2.getMin());
	}
}
