import java.util.*;
public class calculatior {
    public static void main(String[] args) {
        try(Scanner s=new Scanner(System.in)){
            int a,b,c;
            System.out.println("Enter 1 for Addition");
            System.out.println("Enter 2 for Subtraction");
            System.out.println("Enter 3 for Multply");
            System.out.println("Enter 4 for Divide");
            int ch=s.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter 1st number:");
                    System.out.println("Enter 2nd number:");
                    a=s.nextInt();
                    b=s.nextInt();
                    c=a+b;
                    System.out.println("Addition is: " + c);
                    break;
                case 2:
                    System.out.println("Enter 1st number");
                    System.out.println("Enter 2nd number:");
                    a=s.nextInt();
                    b=s.nextInt();
                    c=a-b;
                    System.out.println("Subtraction is: " + c);
                    break;
                case 3:
                    System.out.println("Enter 1st number");
                    System.out.println("Enter 2nd number:");
                    a=s.nextInt();
                    b=s.nextInt();
                    c=a*b;
                    System.out.println("Multply is: " + c);
                    break;
                case 4:
                    System.out.println("Enter 1st number");
                    System.out.println("Enter 2nd number:");
                    a=s.nextInt();
                    b=s.nextInt();
                    c=a/b;
                    System.out.println("Divide is: " + c); 
                    break;       
                default:
                    break;
            };
        };
    };
};
