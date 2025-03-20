package genericsPackage;

import java.util.Arrays;

public class CustomArraylist {

    private int[] data;
    private int size = 0;

    public CustomArraylist(){
        int DEFAULT_SIZE = 10;
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }

        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        for(int i = 0;i< data.length;i++){
            temp[i] = data[i];
        }

        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove(){
        return data[--size];
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArraylist obj = new CustomArraylist();
        obj.add(23);
        obj.add(23);
        obj.add(23);
        obj.add(23);
        obj.add(23);
        obj.add(23);
        obj.add(23);
        obj.add(23);
        obj.add(23);
        obj.add(23);
        obj.add(23);

        System.out.println(obj);
    }
}
