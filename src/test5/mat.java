package test5;

public class mat{
int [][] matrix;
	
	mat(int [][] mat)
	{
		matrix=mat;
	}
	
		
	    public static  mat add(mat a,mat b)
	    {
	    	int row =a.matrix.length;
	    	int col=a.matrix[0].length;
	    	int[][] matrix1=new int[row][col];
	    	mat c=new mat(matrix1);
	    	for(int i=0;i<row;i++) {
	    		for(int j=0;j<col;j++) {
	    			matrix1[i][j]=a.matrix[i][j]+b.matrix[i][j];
	    		}
	    	}
	    	
	    	return c;
	    	
	    }
	    public static mat multiply(mat a,mat b)
	    {
	    	int row =a.matrix.length;
	    	int col=a.matrix[0].length;
	    	int[][] matrix1=new int[row][col];
	    	mat c=new mat(matrix1);
	    	for(int i=0;i<c.matrix[0].length;i++) {
	    		for(int j=0;j<c.matrix.length;j++) {
	    		for (int j2 = 0; j2 <a.matrix.length ; j2++) {
					c.matrix[i][j]+=(a.matrix[i][j2]*b.matrix[j2][j]);
				}	
	    		}
	    	}
	    	
	    	return c;
	    }
	    public static mat transpose(mat m)
	    {
	    	int row =m.matrix.length;
	    	int col=m.matrix[0].length;
	    	int[][] matrix1=new int[row][col];
	    	mat c=new mat(matrix1);
	    	for(int i=0;i<col;i++) {
	    		for (int j = 0; j <row; j++) {
					c.matrix[j][i]=m.matrix[i][j];
				}
	    	}
	    	
	    	return c;
	    }
	    public static mat rotate(mat m)
	    {
	    	for (int i = 0; i < m.matrix.length; i++) {
				for (int j = i; j <i ; j++) {
					int temp=m.matrix[i][j];
					m.matrix[i][j]=m.matrix[j][i];
					
					m.matrix[j][i] = m.matrix[i][j]; 
				       
	                // move values from left to bottom 
	                m.matrix[i][j] = m.matrix[j][i]; 
	       
	                // assign temp to left 
	                m.matrix[i][j] = temp; 
				}
			}
	    	return m;
	    	
	    }
	    public void print()
	    {
	        for(int i=0;i<matrix.length;i++)
	        {
	            for(int j=0;j<matrix[0].length;j++)
	            {
	                System.out.print(matrix[i][j]+" ");
	            }
	            System.out.println();
	        }
	    }
	 }
