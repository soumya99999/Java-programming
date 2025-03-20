public class StaticBlock {
    static int a = 5;
    static int b;

    {
        System.out.println(a+ " Inside without static block");
        int c = 10;
        System.out.println("Inside block "+ c);
    }
    int c = 15;

    static{
        // First Print because at first class will be loaded and static is related to class
        System.out.println("Inside static Block");
        b = a * 5;
    }
    public static void main(String[] args) {
        System.out.println("Inside Main block");
        System.out.println(StaticBlock.a + " "+ StaticBlock.b);
        StaticBlock s = new StaticBlock();
        System.out.println(s.c);
    }
}
