public class ClassConcept {
    public static void main(String[] args) {
        Student soumya = new Student();
        Student st = new Student(soumya);

        System.out.println(st);
        System.out.println(st.rno);
        System.out.println(st.marks);
        System.out.println(st.name);

        Student pinkun = new Student();
        Student somu = new Student(25,"Somu",99.8f);

        System.out.println(pinkun.rno);
        System.out.println(somu.rno);
    }
}

class Student{
    int rno;
    String name;
    float marks;

    Student(){
        // Internally : new Student(34,"Soumya",78.4f);
        this(34,"Soumya",78.4f);
    }

    Student(Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    Student(int rno,String name,float mark){
        this.rno = rno;
        this.name = name;
        this.marks = mark;
    }
}
