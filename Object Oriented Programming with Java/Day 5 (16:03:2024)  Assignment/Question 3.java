import java.util.Scanner;
import java.util.Vector;

class Employee{
    String name;
    int rank;
    double marks;

    public void setDetails(String name, int rank){
        this.name = name;
        this.rank = rank;
    }

    public void setDetails(int rank, String name){
        this.rank = rank;
        this.name = name;
    }

    public void setDetails(String name, double marks, int rank){
        this.name = name;
        this.marks = marks;
        this.rank = rank;
    }

    public void showDetails(){
        System.out.println("Name : " + name);
        System.out.println("Rank : " + rank);
        System.out.println("Marks : " + marks);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee1 = new Employee();
        employee1.setDetails("Ronny", 5);
        employee1.showDetails();
        
        System.out.println("\n");
        
        Employee employee2 = new Employee();
        employee1.setDetails(2, "Praharsh");
        employee1.showDetails();
        
        System.out.println("\n");

        Employee employee3 = new Employee();
        employee1.setDetails("Raj", 79.98, 4);
        employee1.showDetails();
    }
}
