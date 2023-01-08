public class PrimeNumber {
    public static void main(String[] args) {

        int num = 44;
        int i = 1;
        int count = 0;
        
        do {
            if (num % i == 0) {
                count++;
            }

            i++;
        } while (num >= i);

        if(count <= 2)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");

    }
}