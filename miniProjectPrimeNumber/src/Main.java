public class Main {
    public static void main(String[] args) {

     int number=45;
     int remainder,i;
     boolean isPrime=true;

     if(number==1){
         System.out.println("Number is not prime");
         return;
     }
     if(number<1){
         System.out.println("Invalid number");
     }




     for(i=2;i<number;i++){
         if(number%i==0){
             isPrime=false;

         }
     }
     if(isPrime){
         System.out.println("Number is prime");
     }
     else{
         System.out.println("Number is not prime");
     }


     }
    }
