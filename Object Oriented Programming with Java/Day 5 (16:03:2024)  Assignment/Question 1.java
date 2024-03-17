import java.util.Scanner;

 class Student{
    String name;
    int id;
    int rank;

  public void setDetails(String name, int id, int rank){
        this.name = name;
        this.id = id;
        this.rank = rank;
    }

    public void printDetails(){
        System.out.println("Name : " + this.name);
        System.out.println("Id : " + this.id);
        System.out.println("Rank : " + this.rank);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student1 = new Student();
        student1.printDetails();

        Student student2 = new Student();
        student2.setDetails("Praharsh", 2234560, 6);
        student2.printDetails();

        Student student3 = new Student();
        student3.setDetails(sc.nextLine(), sc.nextInt(), sc.nextInt());
        student3.printDetails();
         
    }
}
