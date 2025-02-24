import java.util.Iterator;

class CustomCollection<T> implements Iterable<T> {
    private T[] items;
    private int size;

    public CustomCollection(T[] items) {
        this.items = items;
        this.size = items.length;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public T next() {
                return items[index++];
            }
        };
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        CustomCollection<String> collection = new CustomCollection<>(names);

        System.out.println("Iterating over CustomCollection:");
        for (String name : collection) {
            System.out.println(name);
        }
    }
}
