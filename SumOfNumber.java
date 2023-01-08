public class SumOfNumber {
    public static void main(String[] args) {
        int num = 5;
        int sum = 0;

        while (num >= 0) {
            sum += num;
            num--;
        }

        System.out.println(sum);
    }
}
