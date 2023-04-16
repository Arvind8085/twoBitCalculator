import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalculatorClass calculator = new CalculatorClass();
        // Call the methods on the calculator object
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Select which operation do you want to perform"); 
         System.out.println("1.Addition"); 
         System.out.println("2.Substraction"); 
          System.out.println("3.Multiplication"); 
           System.out.println("4. Division");
           float temp = sc.nextInt();
        if (temp ==1){
            System.out.println("Enter your numbers X and Y");
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Addition: " + calculator.add(x, y));
        }
        else if (temp ==2){
            System.out.println("Enter your numbers");
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Substraction: " + calculator.sub(x, y));
        }
        else if (temp ==3){
            System.out.println("Enter your numbers");
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Multiplication: " + calculator.mul(x, y));
        }

        else if (temp ==4){
            System.out.println("Enter your numbers");
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Division: " + calculator.div(x, y));
        }
        else {
            System.out.println("Error out of range calculation");
        }
    
        sc.close();
    
       // System.out.println("Subtraction: " + calculator.sub(x, y));
       // System.out.println("Multiplication: " + calculator.mul(x, y));
       // System.out.println("Division: " + calculator.div(x, y));
    }
}
