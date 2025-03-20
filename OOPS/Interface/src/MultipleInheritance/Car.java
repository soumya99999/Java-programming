package MultipleInheritance;

public class Car implements Engine,Brake,Media{

    @Override
    public void brake() {
        System.out.println("Inside Break");
    }

    @Override
    public void start() {
        System.out.println("Inside Start");
    }

    @Override
    public void stop() {
        System.out.println("Inside stop");
    }

    @Override
    public void acc() {
        System.out.println("Inside acc");
    }

    @Override
    public void DefaultMethod() {
        Engine.super.DefaultMethod();
    }

    @Override
    public void media() {

    }
}
