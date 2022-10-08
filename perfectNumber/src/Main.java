public class Main {
    public static void main(String[] args) {

        int number=1;
        int i,total=0;
        for(i=1;i<number;i++){
            if(number%i==0){
                total=total+i;

            }
        }
        if(total==number){
            System.out.println("Number is perfect.");
        }
        else{
            System.out.println("Number is not perfect.");
        }
    }
}