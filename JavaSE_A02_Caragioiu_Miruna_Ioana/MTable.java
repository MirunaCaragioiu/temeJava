public class MTable {

	public static void main(String[] args) {
		int produs=0;
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				produs=i*j;
				System.out.println(i+"x"+j+"="+produs);
			}
			System.out.println("\n");
		}
	}

}
