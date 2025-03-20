package AbstractClass;

public class daughter extends Parent{
    public daughter(int age) {
        super(age);
    }

    @Override
    void normal(){
        System.out.println("Normal Method inside Daughter class");
    }

    @Override
    void carrer(String name) {
        System.out.println(name + " I will be a mother");
    }

    @Override
    void partner(String name, int age) {
        System.out.println(name + " my partner's name and his age is : "+ age);
    }
}
