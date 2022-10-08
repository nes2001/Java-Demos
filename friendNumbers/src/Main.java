public class Main {
    public static void main(String[] args) {

        int number1 = 220, number2 = 284;
        int i, j;
        int total1 = 0;
        int total2 = 0;
        for (i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                total1 = total1 + i;
            }
        }
        for (j = 1; j < number2; j++) {
            if (number2 % j == 0) {
                total2 = total2 + j;
            }
        }
        if (number2== total1 && number1 == total2) {
            System.out.println("number1 and number 2 are friend numbers");
        } else {
            System.out.println("number1 and number 2 are not friend numbers");
        }
    }
}


