import java.util.Scanner;

public class gas5_1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int nrZile;
		float litres[]=new float[300];
		float money[]= new float[300];
		float totalL=0;
		float sumM=0;
		float avgL, avgM;
		
		Scanner input= new Scanner(System.in);
		System.out.println("Nr de zile: ");
		nrZile = input.nextInt();
		
		for(int i=0;i<nrZile;i++)
		{
			Scanner input2= new Scanner(System.in);
			System.out.println("litres[" + i + "]= ");
			litres[i] = input2.nextFloat();
		}
		
		for(int i=0;i<nrZile;i++)
		{
			Scanner input3= new Scanner(System.in);
			System.out.println("money[" + i + "]= ");
			money[i] = input3.nextFloat();
		}
		
		for(int i=0;i<nrZile;i++)
		{
			totalL=totalL+litres[i];
			sumM=sumM+money[i];
		}
		
		avgL=totalL/nrZile;
		avgM=sumM/nrZile;
		
		System.out.println("Nr total de litrii consumati in cele " +  nrZile + " zile este:" + totalL + ", cheltuind suma de " + sumM);
		System.out.println("Consumul mediu de litrii in cele " + nrZile + " zile este: " + avgL + ", iar consumul mediu de bani este: " + avgM);
	}

}
