public class CalculatorClass{
    public int add (int x, int y){
        return x+y;
    }
    public int sub (int x, int y){
        return x-y;
    }
    public int mul (int x, int y){
        return x*y;
    }
    public int div (int x, int y){
         if (y == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return -1;
        }
        return x/y;

    }
}