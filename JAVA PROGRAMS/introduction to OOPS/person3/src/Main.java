class person{
    String name="Sofia";
    String Qualification="Masters in Computer Science";
    String colour="White";
    String CollegeName="Concordia University";
    String Rollnumber="18M21A0570";
    int age=24;

    void Student(){
        System.out.println("Hello! My name is :- "+ name);
        System.out.println("Hello! My qualification is :- "+ Qualification);
        System.out.println("Hello! My colour is :- "+ colour);
        System.out.println("Hello! My CollegeName is :- "+ CollegeName);
        System.out.println("Hello! My Rollnumber is :- "+ Rollnumber);
        System.out.println("Hello! My age is :- "+ age);
    }
}
class Evaluation{
    public static void main(String args[]){
        person imad=new person();
        imad.Student();
    }
}