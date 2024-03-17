import java.util.Scanner;
import java.util.Vector;

class Vehicle{
    public static void honk(){
        System.out.println("HONK, in 1 method");
    }
    
    public static void honk(String n){
        System.out.println("HONK, in 2 method");
    }
    
    public static void honk(int n){
        int i = 0;
        do{
            System.out.println("HONK, in 3 method");
            i++;
        }while (i < n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehicle.honk();

        System.out.print("Enter 'Start': ");
        String n = sc.nextLine(); 
        Vehicle.honk(n);
        
        Vehicle.honk(2);
         
    }
}