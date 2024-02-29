class Array{

	public static void main(String args[]){

		int array[] = {5,4,3,9,1,7,9};
		int min = array[0];
		int max = array[0];

		for (int i=0; i< array.length; i++)
		{
          		if (array[i] < min) 
			{
                			min = array[i];
            		}
           		else 
			{
                			max = array[i]; 
            		}
		}	

		System.out.println("Minimum number in Array is: " + min);
		System.out.println("Maximum number in Array is: " + max);



	}

}