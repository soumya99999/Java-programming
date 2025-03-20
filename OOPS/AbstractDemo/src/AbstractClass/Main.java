package AbstractClass;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(20);
        son.carrer("soumya");
        son.partner("girl",18);

        daughter d = new daughter(18);
        d.carrer("Neha");
        d.partner("Hero",34);

        Parent p = new daughter(18);
        p.carrer("Parent");
        p.normal();

        Parent ref = new Son(30);
        ref.normal();
    }
}
