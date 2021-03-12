public class ProgMainConsume {
public static void main(String[] agrs)
{
	Consume c1=new Consume(new float[] {3,4,10},new float[] {3,3,4});
	System.out.println("Consumul mediu in litri este: "+c1.getAvgConsumeLiters()+" Consumul total in litri este: "+c1.getOverallConsumeLiters());
	System.out.println("Consumul mediu in bani este: "+c1.getAvgConsumeMoney()+" Consumul total in bani este: "+c1.getOverallConsumeMoney());
	
}
}