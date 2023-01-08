import java.util.Scanner;

public class CheckPrime {

    public static boolean isPrime(int num) {

        if(num % 1 == 0 && num % num == 0)
            return true;

        for (int i = 2; i < num; i++) {
            if (i % num == 0) {
                return false;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        boolean res = isPrime(num);

        if(res)
            System.out.println("Prime");
        else
            System.out.println("Non-Prime");

        sc.close();
    }
}
