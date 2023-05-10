//***Non-Primitive Data types***:-
//These are the Data types which are of not fixed size.
//These are usually declared with a 'new' keyword.
class Main {
    public static void main(String[] args) {
        String name=new String("Aman");
        int[] marks=new int[3];
        marks[0]=87;
        marks[1]=23;
        marks[2]=98;
        System.out.println(marks[0]);

        System.out.println("Concatenation:-");
        //Concatenation
        String name1=new String("imad");
        String description=new String(" is a good person");
        String sentence=name1+description;
        System.out.println(sentence);

        System.out.println("CharAT:-");
        //CharAT
        String name2=new String("imad");
        System.out.println(name2.charAt(0));
        System.out.println(name2.charAt(1));
        System.out.println(name2.charAt(2));
        System.out.println(name2.charAt(3));


        System.out.println("Lenght:-");
        //Lenght
        String name4=new String("imad");
        System.out.println(name.length());

        //Substring:-
        String name5=new String("imaduddin");
        System.out.println(name5.substring(0,4));
        }
    }
