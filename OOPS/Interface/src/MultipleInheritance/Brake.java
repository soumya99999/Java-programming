package MultipleInheritance;

public interface Brake{
    void brake();

    default void DefaultMethod(){
        System.out.println("Hey I am also a default Method");
    }
}
