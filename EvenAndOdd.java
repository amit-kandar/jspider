public class EvenAndOdd {

    public static String checkEvenODD(int n) {
        String res = n % 2 == 0 ? "Even" : "Odd";
        return res;
    }

    public static void main(String[] args) {

        int num = 24;

        String result = checkEvenODD(num);

        System.out.println(result);

    }
}
