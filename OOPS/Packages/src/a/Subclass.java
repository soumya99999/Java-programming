package a;

import AccessModifier.ParentClass;

public class Subclass extends ParentClass {
    public Subclass(int num, String name){
        super(num,name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(34,"soumya");
        int n = obj.num;
        // It will give me error as this is a default access modifier, and it can only access within the package subclass
//        String name = obj.name;
    }
}
