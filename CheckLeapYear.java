public class CheckLeapYear {

    public static boolean isLeap(int year) {

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                System.out.println(year + " this is a century");
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int year = 2000;

        boolean res = isLeap(year);

        if(res)
            System.out.println(year+" is a leap year");
        else
            System.out.println(year+" is not a leap year");

    }
}
