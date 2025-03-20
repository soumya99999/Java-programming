package AbstractClass;

public abstract class Parent {
    int age;

    public Parent(int age) {
        this.age = age;
    }

    void normal(){
        System.out.println("Normal Method inside Parent class");
    }

    abstract void carrer(String name);
    abstract void partner(String name,int age);
}
