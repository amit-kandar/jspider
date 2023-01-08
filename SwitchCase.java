public class SwitchCase {
    public static void main(String[] args) {

        int num1 = 60;
        int num2 = 20;

        // Add
        int symbol = 5;



        switch (symbol) {

            // Addition
            case 1:
                System.out.println("Addition of num1 and num2 is " + (num1+num2));
                break;

            // Substraction
            case 2:
                System.out.println("Substruction of num1 and num2 is "+(num1-num2));
                break;
                
            // Multiplication
            case 3:
                System.out.println("Multiplication of num1 and num2 is "+(num1*num2));
                break;
            
            // Division
            case 4:
                System.out.println("Division of num1 and num2 is "+(num1/num2));
                break;
        
            default:
                System.out.println("Invalid Input!");
                break;
        }
    }
}
