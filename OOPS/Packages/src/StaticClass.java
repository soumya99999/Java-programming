public class StaticClass {
    //  static class only means it doesn’t need an instance of the outer class (in this case, StaticClass).
    // If I am making a class static, it doesn't mean it will make all the stuff present in it static.
    static class InnerClass{
        String name;

        public InnerClass(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        InnerClass I = new InnerClass("soumya");
        InnerClass J = new InnerClass("Pinkun");

        System.out.println(I.name);
        System.out.println(J.name);
    }
}
