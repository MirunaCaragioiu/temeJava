package eu.ase.jrobot;
import robocode.*;

public class Robot extends robocode.Robot
{
	 public boolean aggressive;
	 public boolean scanForRobots;
     int k=0;
    public void run() 
	{
		//Assignement 6.1
		  /*ahead(150);
			turnRight(90);
			ahead(150);
			turnRight(90);
			ahead(150);
			turnRight(90);
			ahead(150); */
	 
       //Assignment 6.2
	   /* for(int i=0;i<10;i++)
	 	{
	 		turnRight(90);
	 		ahead(150);
	 		turnRight(90);
	 		ahead(150);
	 		turnRight(90);
	 		ahead(150);
	    } */
	      
	   //Assignment 6.3
	     /*int i=0;
	       while(i<4)
           {
	    	  ahead(200);
	    	  turnRight(40);
	    	  back(50);
	    	  turnLeft(140);
	    	  i++;
	       } */
	    	 
       //Assignement 6.4
	    /* while (true)
	       {
	   	 	 turnRight(90);
	   		 ahead(150);
	   		 turnRight(90);
	   		 ahead(150);
	   		 turnRight(90);
	   		 ahead(150); 
	        }*/
	 
       //Assignement 6.5
	     /*while (true)
	       { 
	   		 turnRight(90);
	   		 ahead(150);
	   		 turnRight(90);
	   		 ahead(150);
	   		 turnRight(90);
	   		 ahead(150);
	   		 k++;
	       }*/
	 
      // Assignment 6.6	
         /* while(true)
	      {
			ahead(150);
	 		int x=2;
			if(x%2==0)
	 		{
				turnRight(90);
				ahead(150);
				turnRight(90);
				ahead(150);
				turnRight(90);
				ahead(150);
				System.out.println("It's moving clockwise");
	 		 }
	 		x++;
		   if(x%2!=0)
		   {
			turnLeft(90);
			ahead(150);
			turnLeft(90);
			ahead(150);
			turnLeft(90);
			ahead(150);
			System.out.println("It's moving anti-clockwise");
	 		}
	 	} */
		 
      //Assignment 6.7
         //moveInSquare(100);
		
      //Assignment 6.8
	      while(true){
		   if(aggressive) 
           {
  			  ahead(120);
	 		  turnRight(90);
	 		  fire(35);
	 		  ahead(120);
	 		  turnRight(90);
	 		  fire(35);
	 		  ahead(120);
	 		  turnRight(90);
	 		  fire(35);
	 		  ahead(120);
	 		  turnRight(90);
	 		  fire(35); 
   			}
		  else{
  		   ahead(120);
	 	   turnRight(90);
	 	   ahead(120);
	 	   turnRight(90);
	 	   ahead(120);
	 	   turnRight(90);
	 	   ahead(120);
	 	   turnRight(90);
          }
		 while(true)
		 {
			if(scanForRobots==true)
			{
          	   ahead(120);
	      	   turnRight(90);
			   turnRadarRight(270);
	      	   ahead(120);
	      	   turnRight(90);
			   turnRadarRight(270);
	      	   ahead(120);
	      	   turnRight(90);
			   turnRadarRight(270);
	      	   ahead(120);
	      	   turnRight(90);
			   turnRadarRight(270);
             }
             else
			{           
           	    ahead(120);
	      	 	turnRight(90);
	      	 	ahead(120);
	      	 	turnRight(90);
	      	 	ahead(120);
	      	 	turnRight(90);
	      	 	ahead(120);
	      	 	turnRight(90);
			}    	
		}
	} 
	 
}

	  //Assignment 6.5
        /* public void onRoundEnded(RoundEndedEvent event){
              System.out.println("a facut "+k+" patrate");
         } */
		 
      //Assignment 6.8
        public void onScannedRobot(ScannedRobotEvent e) {
		    System.out.println("Numele robotului este:"+e.getName()+" si are energia:"+e.getEnergy());
		    fire(2);
	    }
		
      //Assignment 6.7
       /* public void moveInSquare(int lenghtOfSide)
		{
			while(true)
			{
	       	    ahead(lenghtOfSide);
				turnRight(90);
				ahead(lenghtOfSide);
				turnRight(90);
				ahead(lenghtOfSide);
				turnRight(90);
				ahead(lenghtOfSide);
				k++;	
				out.println("metoda moveInSquare");       
			 }
        }
	
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		turnRight(60);
		back(30);
	}

	public void onHitWall(HitWallEvent e) {
	
		turnLeft(180);
		ahead(20);
	}	*/

}
