
public class MainParkingPlace {

	public static void main(String[] args) {
		ParkingPlace p1=new ParkingPlace(5, new float[]{120,45,30,180,12} );
	
		System.out.println("Max:  "+p1.getMax() +" Min:  "+p1.getMin());
	}
}
