import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String A=sc.next();
//        /* Enter your code here. Print output to STDOUT. */
//        StringBuilder str = new StringBuilder();
//        str.append(A);
//        StringBuilder rev = str.reverse();
//        System.out.println(rev);
//        if(str == rev){
//            System.out.println("yes"+(str == rev));
//        }
//        else{
//            System.out.println("No");
//        }
//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
//        // Write your code here.
//        int count=0;
//        String regex="[,!.?_'@\\s]+";
//        String []arr=s.split(regex);
//        System.out.println(count);
//        for(String x:arr){
//            count++;
//            System.out.println(x);
//        }
//        System.out.println(count);
//        scan.close();

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s=s.trim();

        String regex="[^a-zA-Z]+";
        String[] arr=s.split(regex);
        if (s.length() == 0){
            System.out.println(0);
        }
        else{
            System.out.println(arr.length);
        }
        for(String x:arr){
            System.out.println(x);
        }
        scan.close();



    }
}
