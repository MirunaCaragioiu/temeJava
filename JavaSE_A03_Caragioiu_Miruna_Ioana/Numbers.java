
public class Numbers {

	public static void main(String[] args) {
		int[] numbers = new int[100];
		int sum=0;
		float avg=0.0f;
		int no=0;
		
		for(int i=0;i<numbers.length;i++)
		{
			numbers[i]= (int)(Math.random()*100);
			sum+=numbers[i];
			System.out.println("Numar[" + i+ "]=" + numbers[i]);
		}
		
		avg=sum/numbers.length;
		
		System.out.println("Suma lor=" + sum);
		System.out.println("Average=" + avg);
		
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]>avg)
				no++;
		}
		
		System.out.println("Sunt " + no + " de numere mai mari decat media");
	}

}
