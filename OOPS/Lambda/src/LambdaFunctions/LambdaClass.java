package LambdaFunctions;

import java.util.ArrayList;
import java.util.function.Consumer;

@FunctionalInterface
interface Operation{
    int operation(int a,int b);
}


public class LambdaClass {

    private int operate(int num1,int num2,Operation op){
        return op.operation(num1,num2);
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i< 5;i++){
            list.add(i + 1);
        }

        list.forEach((item) -> System.out.println(item * 2));

        Consumer<Integer> fun = ((item) -> System.out.println(item * 2));
        System.out.println("After consumer : " + fun);
        list.forEach(fun);

        Operation sum = (a,b) -> a+b;
        Operation sub = (a,b) -> a-b;
        Operation mul = (a,b) -> a*b;

        System.out.println(sum == sub);

        LambdaClass lam = new LambdaClass();
        System.out.println(lam.operate(4,5,sum));
        System.out.println(lam.operate(4,5,sub));
        System.out.println(lam.operate(4,5,mul));
    }
}


