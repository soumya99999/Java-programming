package Comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student kunal = new Student(12 ,89.76f);
        Student Soumya = new Student(12 ,98.76f);
        Student Hari = new Student(12 ,38.76f);
        Student Ram = new Student(12 ,58.76f);
        Student Krushna = new Student(12 ,68.76f);

        Student[] list = {kunal,Soumya,Hari,Ram,Krushna};

//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return -(int)(o1.marks - o2.marks);
//            }
//        });
//
//        System.out.println(Arrays.toString(list));

        // Lambda Expression
        Arrays.sort(list,(p1,p2) -> -(int)(p1.marks - p2.marks));
        System.out.println(Arrays.toString(list));

        if(kunal.compareTo(Soumya) < 0){
            System.out.println("Soumya has more marks");
        }

    }
}
