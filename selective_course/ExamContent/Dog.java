public class Dog extends Animal{
    void laugh(){
        System.out.println("I can laugh");
    }
    public static void main(String args[]){
        Dog LittleDog = new Dog();
        LittleDog.laugh();
        LittleDog.speak();
    }
    void eat(){
        System.out.println("狗是吃肉的");
    }
}