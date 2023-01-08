public class Multiplication{
    public static void main(String[] args) {
        int value1 = 10;
        int value2 = 30;

        int res = value1 * value2;

        System.out.println("Multiplication of "+value1 +" and "+ value2 +" is "+res);

        // System.out.println(++value1);
        // System.out.println(value1++);

        System.out.println(++value1 + value1++);
    }
}