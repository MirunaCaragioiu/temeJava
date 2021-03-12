public class Matrix  {
	public int linii;
	public int coloane;
	public int[][] info=new int[linii][coloane];
	
	public Matrix(int linii,int coloane,int[][] info)
	{ this.linii=linii;
	  this.coloane=coloane;
	  this.info=info;
		
	  
	}
	
	  public Matrix createMatrix(final int[][] components){
		  Matrix m=new Matrix(components.length,components[0].length,components);
		    return m;
		    }

	public Matrix addComponents(final Matrix a) {
	    final int[][] res = new int[linii][coloane];
	    for (int i = 0; i < linii; i++) {
	        for (int j = 0; j < coloane; j++) {
	        res[i][j] = info[i][j] + a.info[i][j];
	        }
	    }
	    return createMatrix(res);
	    }
	
	public static int[] addLine(final Matrix a)
	{
		final int[] res=new int[a.linii];
		int total;
		for(int i=0;i<a.linii;i++)
			{total=0;
			for(int j=0;j<a.coloane;j++)
				total+=a.info[i][j];
			res[i]=total;
			}
		return res;
				
	}
	}
	

