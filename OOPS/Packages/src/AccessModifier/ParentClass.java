package AccessModifier;

public class ParentClass {
    protected int num;
    String name;
    private boolean check;

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public ParentClass() {

    }

    public ParentClass(int num, String name){
        this.num = num;
        this.name = name;
    }

}
