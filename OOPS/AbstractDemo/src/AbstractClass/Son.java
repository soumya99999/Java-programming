package AbstractClass;

public class Son extends Parent{

    public Son(int age) {
        super(age);
    }

    @Override
    void normal(){
        super.normal();
        System.out.println("Inside Son");
    }

    @Override
    void carrer(String name) {
        System.out.println(name + " I am going to be a coder");
    }

    @Override
    void partner(String name, int age) {
        System.out.println("Girl's age is : "+ age + " and "+ name + " is a doctor");
    }
}
