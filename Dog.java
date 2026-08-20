class Animal{
    void eat()
    {
        System.out.println("animal is eaating...");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("dog is eating...");
    }
    public static void main(String args[])
    {
        Animal a = new Dog();
        a.eat();
    }
}