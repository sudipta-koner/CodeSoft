import java.util.*;
class StudentGradeCal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of following Subjects : ");

        System.out.println("1. Bengali");
        int markB = sc.nextInt();

        System.out.println("2. English");
        int markE = sc.nextInt();

        System.out.println("3. Mathematics");
        int markM = sc.nextInt();

        System.out.println("4. Physics");
        int markP = sc.nextInt();

        System.out.println("5. Chemistry");
        int markCh = sc.nextInt();

        System.out.println("6. Computer Sc");
        int markC = sc.nextInt();

        int total = markB + markE + markM + markP + markCh + markC;
        float avg = (total*100)/600; 

        System.out.println("Total awarded marks : " + total);
        System.out.println("Avg. Percentage : " + avg);

        if(avg >= 90)
        {
            System.out.println("Your Grade is : A+");
        }
        else if(avg >= 80 || avg <= 89)
        {
            System.out.println("Your Grade is : A");
        }
        else if(avg >= 70 || avg <= 79)
        {
            System.out.println("Your Grade is : B+");
        }
        else if(avg >= 60 || avg <= 69)
        {
            System.out.println("Your Grade is : B");
        }
        else if(avg >= 50 || avg <= 59)
        {
            System.out.println("Your Grade is : C+");
        }
        else if(avg >= 40 || avg <= 49)
        {
            System.out.println("Your Grade is : C");
        }
        else
        {
            System.out.println("Your Grade is : F");
        }


    }
}
