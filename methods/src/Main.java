public class Main {
    public static void main(String[] args) {

        findingnumber();

    }

    public static void findingnumber() {

        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int finding = 50;
        boolean isThere = false;
        //we are wandering all members of this array with using for loop
        for (int number : numbers) {
            if (number == finding) {
                isThere = true;
                break;//we finished this loop

            }

        }
        String message = "";
        if (isThere) {
            message = "Number is here:" + finding;
            giveAMessage(message);
        } else {
            giveAMessage("Number is not here:" + finding);
        }
        //Project is working in main in java.


    }

    public static void giveAMessage(String message) {
        System.out.println(message);

    }
}


