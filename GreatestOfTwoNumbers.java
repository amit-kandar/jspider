public class GreatestOfTwoNumbers {
    public static void main(String[] args) {

        int num1 = 1010;
        int num2 = 20;

        System.out.println("The greatest number is "+checkGreatestNumbers(num1, num2));

    }

    public static int checkGreatestNumbers(int num1, int num2) {
        if(num1 > num2)
            return num1;

        return num2;
    }
}
