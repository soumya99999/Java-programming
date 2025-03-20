public class Wrapper {
    public static void main(String[] args) {
        int a = 10;
        int b = 1;

        Integer num = 45;
        Integer num1 = 30;

        swap(num,num1);
        swapInt(a,b);
        System.out.println(num.byteValue());
        System.out.println(num + " "+num1);
        System.out.println(a + " "+b);

        final A soumya = new A("Soumya");
        soumya.name = "Other name";

        A obj;
        for(int i = 0;i< 1000000;i++){
            obj = new A("Random name");
        }

        // When a non primitive is final, you can't reassign it
        // soumya = new A("Other name")
    }

    // Here I am passing reference variable still can't change the object why ?
    // Answer is the objects are final and you can't change those stuffs
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }

    static void swapInt(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10;
    String name;

    public A(String name) {
        System.out.println("Object is created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
