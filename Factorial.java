public class Factorial {
    public static void main(String[] args) {
        int num = 3;
        int factorial = 1;

        while(num > 0) {
            factorial *= num;
            num--;
        }

        System.out.println(factorial);
    }
}
