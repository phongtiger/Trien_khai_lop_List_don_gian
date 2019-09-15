import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // Tăng gấp đôi kích thước mảng chứa phần tử
    private void ensureCapa() {
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }

    //Thêm phần tử vào cuối danh sách
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;

    }

    //Tra va phan tu thu i
    public E get(int i) {
        if (i > size || i < 0) {
            throw new IndexOutOfBoundsException("Index: "+i+" ,Size "+i);
        }
        return (E) elements[i];
    }
}
