import java.util.Scanner;

public class day3_userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = sc.nextLine();
        System.out.println("Enter you age");
        int age = sc.nextInt();
        System.out.println("Enter GPA");
        double GPA = sc.nextDouble();
        System.out.println("Your Info is");
        System.out.println("Your Name is " + (name));
        System.out.println("Your Age is " + (age));
        System.out.println("Your GPA is " + (GPA));
        sc.close();
    }
}
