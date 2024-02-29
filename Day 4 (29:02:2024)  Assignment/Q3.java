import java.util.Scanner; 
class Q3{

	public static void main(String args[])
	{
	
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		int sum=0, t;

		for(int i=0; i<n; i++)
		{
			t=2*(i-1);
			if(t%3==0)
			{	
				sum = t;
			}
		}

		System.out.println(sum);

	}

}