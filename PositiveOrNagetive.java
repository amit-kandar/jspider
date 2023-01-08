import java.util.Scanner;

public class PositiveOrNagetive {

    public static String checkPositiveOrNagetive(int num) {
        String s = num < 0 ? "Negetive" : "Positive";
        return s;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String result = checkPositiveOrNagetive(num);

        System.out.println(result);

        sc.close();
    }
}
