class Person{
    
    String name;
    int age;

    void  talk(){
        System.out.println("my name is "+ name);
        System.out.println("my age is "+ age);
    }
}

class Demo{
    public static void main(String args[]){
        Person raju=new Person();
        System.out.println("hash code= "+raju.hashCode());
    }
}