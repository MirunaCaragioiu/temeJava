import java.util.Scanner;
public class km5_4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int nrZile;
		float km[]=new float[700];
		float sum=0.0f;
		float avg;
		float max=0;
		float min=3000;
		
		Scanner input= new Scanner(System.in);
		System.out.println("Nr de zile: ");
		nrZile = input.nextInt();
		
		for(int i=0;i<nrZile;i++)
		{
			Scanner input2= new Scanner(System.in);
			System.out.println("km[" + i + "]= ");
			km[i] = input2.nextFloat();
		}
		
		for(int i=0;i<nrZile;i++)
			sum=sum+km[i];
		avg=sum/nrZile;
		
		for(int i=0;i<nrZile;i++)
		{
			if(km[i]>max)
				max=km[i];
			if(km[i]<min)
				min=km[i];
		}
		
		System.out.println("Media consumului in cele " + nrZile + " zile este de:" + avg + " Maximul de km este de:" + max + " iar min este de" + min);
	}
}
