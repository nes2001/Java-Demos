public class Main {
    public static void main(String[] args) {
        //FOR
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("Loop of FOR is over");

        //WHILE

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("Loop of WHILE is over");

        //DO-WHILE even if condition don.t suit, this loop work at least one time. Database is bugged as using do while

        int j=1;
                do{
                    System.out.println("Loglandı");
                    System.out.println(j);
                    j++;
                }while(j<10);
        System.out.println("Loop of DO-WHILE is over");
    }




}