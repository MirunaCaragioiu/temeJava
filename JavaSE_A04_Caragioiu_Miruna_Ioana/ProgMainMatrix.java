public class ProgMainMatrix {

	public static void main(String[] args) {
		Matrix m1=new Matrix(3,4);
		Matrix m2=new Matrix(4,3);
	
		m1.printMatrix();
		System.out.println("\n Elementul maxim din matrice 1 este: " + m1.maxMatrix());
		
		m2.initMatrix();
		m2.printMatrix();
		System.out.println("\n Elementul maxim din matrice 2 este: " + m2.maxMatrix());

	}

}
