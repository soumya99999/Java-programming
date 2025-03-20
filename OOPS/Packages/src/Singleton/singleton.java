package Singleton;

class Singleton {
    // Step 1: Create a private static instance (eager initialization)
    private static Singleton instance;

    // Step 2: Private constructor to prevent direct instantiation
    private Singleton() {}

    // Step 3: Public method to get the single instance
    public static Singleton getInstance() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton Instance: " + this);
    }
}

class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.showMessage();
        obj2.showMessage();
        System.out.println(obj1);
        System.out.println(obj2);

        // Check if both objects are the same
        System.out.println(obj1 == obj2); // true (same instance)

        String s = "Let's take LeetCode contest";
        String[] array = s.split("\\s+");
        for(String str:array){
            System.out.println(str);
        }
    }
}
