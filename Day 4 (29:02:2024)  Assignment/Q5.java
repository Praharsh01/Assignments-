class Q5
{

	public static void main(String args[])
	{
		
		int[][] matrix1 = {{1, 2},{3, 4}};
        		int[][] matrix2 = {{1, 2},{3, 4}};	

	 	boolean isEqual = true;

		for (int i = 0; i < matrix1.length; i++) 
		{
          	  	for (int j = 0; j < matrix1[i].length; j++) 
			{
                			if (matrix1[i][j] != matrix2[i][j])
				{
					isEqual = false;
					break;
				}
			}

		}

		if (isEqual)
		{
			System.out.println("Matrix are equal.");
		}
		else
		{
			System.out.println("Matrix are not equal");

		}

	        
	}

}