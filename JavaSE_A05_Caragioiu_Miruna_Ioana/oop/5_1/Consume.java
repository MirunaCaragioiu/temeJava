public class Consume {
		private float[] liters;
		private float[] moneyPerLitre;

		public Consume(float[] liters,float[] moneyPerLitre)
		{
			this.liters=liters;
			this.moneyPerLitre=moneyPerLitre;
		}
		public float[] getLiters()
		{
			return this.liters;
		
		}
		public void setLiters(float[] liters)
		{
			this.liters=liters;
		}
		public float[] getMoneyPerLitre()
		{
			return this.moneyPerLitre;
		}
		public void setMoneyPerLitre(float[] moneyPerLitre)
		{
			this.moneyPerLitre=moneyPerLitre;
		}
		
		public float getOverallConsumeLiters()
		{
			float s=0.0f;
			for(int i=0;i<liters.length;i++)
				s=s+liters[i];
			return s;
		}
		public float getAvgConsumeLiters()
		{	float s=0.0f;
			s=getOverallConsumeLiters()/liters.length;
				return s;
		}
		public float getOverallConsumeMoney()
		{	float s=0.0f;
			for(int i=0;i<liters.length;i++)
					s=s+liters[i]*moneyPerLitre[i];
			return s;
		}
		public float getAvgConsumeMoney()
		{float s=0.0f;
		s=getOverallConsumeMoney()/liters.length;
		return s;
			
		}
		
}