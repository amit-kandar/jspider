public class IdentifyCharacters {
    public static void main(String[] args) {

        char ch = '8';

        System.out.println(ch+" this character is a " + checkChar1(ch));
        
    }


    // Using Manually
    public static String checkChar1(char ch) {
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            return "Alphabatic";
        else if(ch >= '0' && ch <= '9')
            return "Number";
        else
            return "Special Character";
    }


    // Using Predefind Method
    public static String checkChar2(char ch) {
        if(Character.isDigit(ch) == true)
            return "Number";
        else if(Character.isLetter(ch))
            return "Alphabatic";
        else
            return "Spacial Character";
            
    }
}
