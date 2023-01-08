public class SwapTwoNumbers{
    public static void main(String[] args){
        int num1 = 45;
        int num2 = 10;

        System.out.println("Before swap num1 value is "+num1 +" and num2 value is "+num2);

        System.out.println();

        Sample ob = new Sample();


        ob.swapNumbers(num1, num2);

        
    }

    

}


class Sample{
    // int num1;
    // int num2;

    // public Sample(int num1, int num2){
    //     this.num1 = num1;
    //     this.num2 = num2;
    // }

    public void swapNumbers(int num1, int num2){

        int temp = 0;

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swap num1 value is "+num1 +" and num2 value is "+num2);
        
    }



}