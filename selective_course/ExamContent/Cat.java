public class Cat extends Animal {
    public static void main(String args[]){
        Animal obj1 = new Animal();
        Animal obj2 = new Dog();
        Animal obj3 = new Cat();

        obj1.eat();
        obj2.eat();
        obj3.eat();
    }
}
