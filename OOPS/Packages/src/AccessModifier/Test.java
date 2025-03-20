package AccessModifier;

public class Test {
    public static void main(String[] args) {
        ParentClass t = new ParentClass(34,"Pinkun");
        int num = t.num; // Protected Access Modifier
        String name = t.name; // Default Access Modifier
    }
}
