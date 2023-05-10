//Created Class with ...
//1)Instance Variable
//2)Parameterised Constructors
//3)used "this" keyword to specify the specific instance variable

//Created a method

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);
        person.printInfo();
    }
}
