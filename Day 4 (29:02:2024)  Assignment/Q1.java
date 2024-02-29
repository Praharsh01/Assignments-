class Array{

	public static void main(String args[]){

		int array[] = {5,4,3,9,1,7,9};
		double sum=0;
		
		for(int i=0; i<=6; i++)
		{
			sum = sum + array[i]; 
		}
 		
		double average = sum / array.length;
		
		System.out.println("Average of array is: " + average);


	}

}