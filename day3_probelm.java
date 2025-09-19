import java.util.Scanner;

public class day3_probelm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name :");
        String name = sc.nextLine();
        System.out.println("Enter you age :");
        int age = sc.nextInt();
        System.out.println("Enter GPA :");
        double GPA = sc.nextDouble();
        System.out.println("Do You Like Coding :");
        boolean likeCoding = sc.nextBoolean();
        System.out.println("Enter Marks of DSA :");
        int dsaMarks = sc.nextInt();
        System.out.println("Enter Marks of DBMS :");
        int dbmsMarks = sc.nextInt();
        System.out.println("Enter Marks of WE:");
        int weMarks = sc.nextInt();
        double AvgMarks = (dbmsMarks + weMarks + dsaMarks) / 3;

        System.out.println("Your Info");
        System.out.println("Your Name is " + (name));

        System.out.println("Your Age is " + (age));
        System.out.println("Your GPA is " + (GPA));
        System.out.println("Interest in Coding  " + (likeCoding));

        System.out.println("Your Total Marks  are " + (dsaMarks + dbmsMarks + weMarks));
        System.out.println("Avg Marks are :" + (AvgMarks));

        System.out.println("Highest Marks are :" +(Math.max(dsaMarks, Math.max(dbmsMarks,weMarks))));
        
        System.out.println("Lowest Marks are :" +(Math.min(dsaMarks, Math.min(dbmsMarks,weMarks))));
sc.close();
    }

}