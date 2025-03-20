package MultipleInheritance;

public interface Engine {
    // By default static final variable
    int price = 78000;
    // By default, Abstract Methods and public access controller
    void start();
    void stop();
    void acc();

    default void DefaultMethod(){
        System.out.println("Hey I am a default method");
    }
}
