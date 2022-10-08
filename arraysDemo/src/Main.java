public class Main {
    public static void main(String[] args) {

        String[] students=new String[4];
        students[0]="Aslı";
        students[1]="Nesli";
        students[2]="Şevval";
        students[3]="Apo";

        for(int i=0;i<students.length;i++){
            System.out.println(students[i]);
        }
        for(String student:students){
            System.out.println(student);
        }
    }
}