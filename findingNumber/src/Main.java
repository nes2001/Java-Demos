public class Main {
    public static void main(String[] args) {

        int[]numbers=new int[]{1,2,5,7,9,0};
        int finding=50;
        boolean isThere=false;
        //we are wandering all members of this array with using for loop
        for(int number:numbers){
            if(number==finding){
                isThere=true;
                break;//we finished this loop

            }

        }
        if(isThere){
            System.out.println("Number is there");
        }
        else{
            System.out.println("Number is not there");
        }
    }
}