import java.util.Scanner;
public class website {
    public static void main(String[] args) {
        System.out.println("welcome to Jeet world");


           System.out.println("Enter 1 for Full Name\n Enter 2 for number\n Enter 3 for enrollment\n enter 4 for qualifications");
           System.out.println("enter choise");
           Scanner sc=new Scanner(System.in);
           int a=sc.nextInt();
           switch(a) {
               case 1:
                   System.out.println("Jeet K. Kumbhani");
                   break;
               case 2:
                       System.out.println("97******83");
                   break;
               case 3:
                           System.out.println("202202100410069");
                   break;
               case 4:
                               System.out.println("completed 10th with 68.50%\nCompleted sem 1 of diploma with 6.95 CGPA\nCompleted sem 2 with 6.61 CGPA");
                   break;
               default:
                   System.out.println("invalid choice");
                   break;
           }


    }
}
