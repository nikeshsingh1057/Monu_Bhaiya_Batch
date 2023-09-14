import java.util.Arrays;

public class Main<E> {

    private static final int INITIAL_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public  Main() {
        elements = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(E element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        return (E) elements[index];
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        
        Main<String> stringList = new  Main<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");

        Main<Integer> intList = new Main<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        System.out.println("String List: " + stringList);
        System.out.println("Integer List: " + intList);
        
        System.out.println(stringList.get(0));
    }
}
