public class Main {
    public static void main(String[] args) {


        //reference type

        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();

        customerManager=customerManager2;
        customerManager.Add();

        customerManager.Remove();

        customerManager.Update();

        //value

        int number1=10;
        int number2=20;
        number2=number1;
        number1=30;
        System.out.println(number2);

    }

}

