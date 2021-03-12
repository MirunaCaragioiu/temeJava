public class MainProg {

	public static void main(String[] args) {
		
		Student [] Studenti=new Student[15];
		Studenti[0]=new Student("Ionescu",new short[] {5,5,9});
		Studenti[1]=new Student("Vasile",new short[] {7,6,8});
		Studenti[2]=new Student("Minoiu",new short[] {9,6,10});
		Studenti[3]=new Student("Georgescu",new short[] {9,7,10});
		Studenti[4]=new Student("Popescu",new short[] {5,10,8});
		Studenti[5]=new Student("Maria",new short[] {5,5,5});
		Studenti[6]=new Student("Alexandrescu",new short[] {5,10,6});
		Studenti[7]=new Student("Barbu",new short[] {5,6,6});
		Studenti[8]=new Student("Florescu",new short[] {8,7,7});
		Studenti[9]=new Student("Pavel",new short[] {10,10,5});
		Studenti[10]=new Student("Gheorghe",new short[] {7,6,9});
		Studenti[11]=new Student("Mircescu",new short[] {9,10,8});
		Studenti[12]=new Student("Olaru",new short[] {5,9,8});
		Studenti[13]=new Student("Dumitru",new short[] {8,8,8});
		Studenti[14]=new Student("Vlaicu",new short[] {7,10,9});
		
		for(int i=0;i<Studenti.length;i++)
			System.out.println("Nume: " +Studenti[i].getSName()+" Media: "+Studenti[i].getAvgMark());
		
		Grupa[] Grupe=new Grupa[5];
		Grupe[0]=new Grupa(1040,new Student[] {Studenti[0],Studenti[1],Studenti[2]});
		Grupe[1]=new Grupa(1041,new Student[] {Studenti[3],Studenti[4],Studenti[5]});
		Grupe[2]=new Grupa(1042,new Student[] {Studenti[6],Studenti[7],Studenti[8]});
		Grupe[3]=new Grupa(1043,new Student[] {Studenti[9],Studenti[10],Studenti[11]});
		Grupe[4]=new Grupa(1044,new Student[] {Studenti[12],Studenti[13],Studenti[14]});
		
		System.out.println("\n");
		for(int i=0;i<Grupe.length;i++) 
			System.out.println("Numar grupa: " +Grupe[i].getNoGroup()+" Media: "+Grupe[i].getAvgGroup());
	
		Serie[] Seria=new Serie[2];
		Seria[0]=new Serie(new Grupa[] {Grupe[0],Grupe[1]},"C");
		Seria[1]=new Serie(new Grupa[] {Grupe[2],Grupe[3],Grupe[4]},"D");
		
		System.out.println("\n");
		for(int i=0;i<Seria.length;i++)
			System.out.println("Seria: " +Seria[i].getSName()+" Media: "+Seria[i].getAvgS());
		
	}

}
