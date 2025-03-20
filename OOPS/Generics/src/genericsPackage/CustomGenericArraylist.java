package genericsPackage;

import java.util.Arrays;

// Here T should be either be Number or it's subclasses
public class CustomGenericArraylist<T extends Number> {

    private Object[] data;
    private int size = 0;

    public CustomGenericArraylist(){
        int DEFAULT_SIZE = 10;
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }

        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for(int i = 0;i< data.length;i++){
            temp[i] = data[i];
        }

        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove(){
        return (T) data[--size];
    }

    public T get(int index){
        return (T)data[index];
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
        CustomGenericArraylist<Integer> generic = new CustomGenericArraylist<>();
        generic.add(23);
        System.out.println(generic);
    }
}
