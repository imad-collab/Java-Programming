class Animal{
    void makesound(){
        System.out.println("cat make sounds like ");
    }
}
class cat extends Animal{
    void makesound(){
        System.out.println("meow meow");
    }
}
class main{
    public static void main(String args[]){
        Animal animal=new Animal();
        cat cat=new cat();
        animal.makesound();
        cat.makesound();
    }
}