//import java.util.Scanner;
public class minutes5_2 {

	//@SuppressWarnings("resource")
	public static void main(String[] args) {
		float minutes[]= {100,50,25,85,25,56,853,521,154,120,45,987,632,987,215,215,254,213,145,456};
		int poz[]=new int[21];
		int poz2[]=new int[21];
		int k=0;
		int t=0;
		float max=0;
		float min=1500;

		//for(int i=0;i<minutes.length;i++) {
		//	Scanner input=new Scanner(System.in);
		//	System.out.println("Nr de minute petrecute in fata calculatorului in ziua: " + i + " este de: ");
		//	minutes[i] = input.nextFloat();
		//}
		
		
		for(int i=0;i<minutes.length;i++)
		{
			if(minutes[i]>max)
			{
				max=minutes[i];
			}
			if(minutes[i]<min)
			{
				min=minutes[i];
			}
		}
		for(int i=0;i<minutes.length;i++)
		{
			if(minutes[i]==max) {
				poz[k]=i;
				k=k+1;
			}
			if(minutes[i]==min) {
				poz2[t]=i;
				t=t+1;
			}
		}
		
		
		System.out.println("Ziua(zilele) in care a petrecut cele mai multe minute(" + max + ") in fata calculatorului a(au) fost:");
		for(int i=0;i<k;i++) 
				System.out.println(poz[i]+ " ");
		
		System.out.println("\nZiua(zilele) in care a petrecut cele mai putine minute(" + min + ") in fata calculatorului a(au) fost:");
		for(int i=0;i<t;i++) 
				System.out.println(poz2[i] + " ");
	}

}
