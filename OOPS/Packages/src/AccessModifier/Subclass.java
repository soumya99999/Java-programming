package AccessModifier;

public class Subclass extends ParentClass{
    public Subclass(int num,String name){
        super(num,name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(34,"soumya");
        int n = obj.num;
        // I am inside the same package subclass that's reason that I can access default modifier inside same package
        String name = obj.name;
        // Error as the check variable is private
//        boolean check = obj.check;
    }
}
