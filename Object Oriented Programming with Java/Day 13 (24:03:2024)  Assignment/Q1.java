class Q1{
	public static void main(String arg[]){

		int num1 = 5;
		int num2 = 0;

		try{
			System.out.println(num1 / num2);
		} catch (Exception ex) {
			System.out.println("Cannot divide by 0");
			ex.printStackTrace();
		}
		
	} 

}