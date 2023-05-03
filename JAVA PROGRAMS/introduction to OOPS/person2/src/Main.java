class person{
    String name = "imaduddin";
    String college = "LIET";
    String section = "CSE-B";
    String rollno = "18M21A0570";
    int age = 23;

    void profile(){
        System.out.println("hello I am  "    + name);
        System.out.println("My college is  " + college);
        System.out.println("My section is  " + section);
        System.out.println("My rollno is  "  + rollno);
        System.out.println("My age is  "     + age);
        System.out.println("-----------------------------");
    }
}
class person2{
    String name = "Akber";
    String college = "MJ";
    String section = "ECE-A";
    String rollno = "nhi mlm";
    int age = 50;

    void profile2(){
        System.out.println("hello I am  "    + name);
        System.out.println("My college is  " + college);
        System.out.println("My section is  " + section);
        System.out.println("My rollno is  "  + rollno);
        System.out.println("My age is  "     + age);
        System.out.println("-----------------------------");
    }
}
class person3{
    String name="abdur rahman";
    int age=18;
    String rollnumber="18M21A0570";
    String college="Concordia University";
    String professorname="Andrew Thomas";

    void profile3(){
        System.out.println("Hello! my name is :- "+ name);
        System.out.println("Hello! my age is :- "+  age);
        System.out.println("Hello! my rollnumber is :- "+rollnumber);
        System.out.println("Hello! my colege is :- "+ college);
        System.out.println("Hello! my professor name is :- "+ professorname);
    }
}
class Demo{
    public static void main(String args[]){
        //class + void =new class()
        //Object create kardo with any name but corresponding to class .
        person imad=new person();
        person2 akber=new person2();
        person3 abdurrahman=new person3();


        imad.profile();
        akber.profile2();
        abdurrahman.profile3();
    }
}