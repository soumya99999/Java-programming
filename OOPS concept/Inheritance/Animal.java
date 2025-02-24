abstract class Animal {
    // Abstract Method
    public abstract void animalSound();
    // Simple Method
    public void sleep(){
        System.out.println("zzz....");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("Barks");
    }
}

class main{
    public static void main(String[] args) {
        // Animal is abstract can't be instantiated
//        Animal animal = new Animal();
        // Now the instance variable of Animal is pointing to an object Dog4
        Animal animal = new Dog();
        animal.sleep();
        animal.animalSound();
    }
}