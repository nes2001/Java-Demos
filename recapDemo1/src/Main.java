public class Main {
    public static void main(String[] args) {
        int number1=95;
        int number2=97;
        int number3=85;
        int max=number1;

        if(max<number2) {
            max = number2;
        }
        if(max<number3) {
            max = number3;
        }
        System.out.println("The maximum value is :" +max);



    }
}