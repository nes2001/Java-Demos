public class Main {
    public static void main(String[] args) {
        String message="The weather is nice today";
        String newMessage=giveACity();

        System.out.println(newMessage);
        int number=count(5,7);
        System.out.println(number);
        int total=count2(2,3,4,5,6,10);
        System.out.println(total);
    }
    public static void add(){
        System.out.println("it was added");


    }
    public static void delete(){
        System.out.println("it was deleted");


    }
    public static void update(){
        System.out.println("it was updated");

    }
    public static int count(int number1,int number2){
         return number1+number2;
    }

    public static int count2(int... numbers){
        int total=0;
        for(int number:numbers){
            total+=number;
        }
        return total;
    }
    public static String giveACity(){
        return "Ankara";
    }

}
//We can.t assign an operation that is void to a value that is a string