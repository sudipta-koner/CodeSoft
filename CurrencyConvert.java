import java.util.*;
class CurrencyConvert
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Select the currency which you want to convert from : ");
        System.out.println("1. Rupee");
        System.out.println("2. Dollar");
        System.out.println("3. Euro");
    
        System.out.print("Enter Your Choice : ");
        int option = sc.nextInt();

        System.out.print("Enter amount : ");
        double amount = sc.nextDouble();

        switch(option)
        {
            case 1:
                System.out.println("Select the currency which you want to convert to : ");
                System.out.println("1. Dollar");
                System.out.println("2. Euro");
                System.out.print("Enter your choice : ");

                int ch = sc.nextInt();
                switch(ch)
                {
                    case 1:
                        double newAmount1 = amount * 0.012;
                        System.out.println(amount + " rupee is equal to " + newAmount1 + " dollar");
                        break;

                    case 2:
                        double newAmount2 = amount * 0.011;
                        System.out.println(amount + " rupee is equal to " + newAmount2 + " euro");
                        break;

                    default:
                        System.out.println("Wrong choice...");
                }
                break;

            case 2:
                System.out.println("Select the currency which you want to convert to : ");
                System.out.println("1. Rupee");
                System.out.println("2. Euro");
                System.out.print("Enter your choice : ");

                int choice = sc.nextInt();
                switch(choice)
                {
                    case 1:
                        double newAmount1 = amount * 83.48;
                        System.out.println(amount + " dollar is equal to " + newAmount1 + " rupee");
                        break;

                    case 2:
                        double newAmount2 = amount * 0.927;
                        System.out.println(amount + " dollar is equal to " + newAmount2 + " euro");
                        break;

                    default:
                        System.out.println("Wrong choice...");
                }
                break;

            case 3:
                System.out.println("Select the currency which you want to convert to : ");
                System.out.println("1. Rupee");
                System.out.println("2. Dollar");
                System.out.print("Enter your choice : ");

                int op = sc.nextInt();
                switch(op)
                {
                    case 1:
                        double newAmount1 = amount * 89.99;
                        System.out.println(amount + " euro is equal to " + newAmount1 + " rupee");
                        break;

                    case 2:
                        double newAmount2 = amount * 1.078;
                        System.out.println(amount + " euro is equal to " + newAmount2 + " dollar");
                        break;

                    default:
                        System.out.println("Wrong choice...");
                }
                break;

            default:
                System.out.println("Wrong Choice...");

        }

        
    }
}