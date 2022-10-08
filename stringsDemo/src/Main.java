public class Main {
    public static void main(String[] args) {

        String message="   The weather is nice today  ";
        System.out.println(message);


        /* System.out.println("The number of element:"+message.length());
        System.out.println("fifth element"+message.charAt(4));
        System.out.println(message.concat(" Hurray!"));
        System.out.println(message.startsWith("T"));
        System.out.println(message.endsWith("y"));
        char[]characters=new char[5];
        message.getChars(0,3,characters,0);
        System.out.println(characters);
        System.out.println(message.indexOf("a"));
        System.out.println(message.lastIndexOf("o"));*/
      //Last index: it started from right one to searh.
        //index Of:it started from left one to search./**/


    String newMessage=message.replace(' ','-');
    System.out.println(newMessage);
    System.out.println(message.substring(5,7));
    for(String word:message.split(" ")){
        System.out.println(word);
    }
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());

//trim: it removes spaces at the begining and lasting.



    }
}