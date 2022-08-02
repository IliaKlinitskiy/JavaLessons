package lessonCollection;

public class MyArrayTest {
    private String[] array = new String[10];
    private int size = 0;

    public void add(String string) {
        array[size] = string;
        size++;
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                array[i] = newArray[i];
            }
            array = newArray;
        }
    }

    public int getSize() {
        return size;
    }

    public String get(int index) {
        return array[index];
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                array[index] = array[i + 1];
            }
            size--;
        }
    }

    public void remove(String string) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (string.equals(array[i])) {
                index = i;
                break;
            }

        }
        if (index != -1) {
            remove(index);
        }
    }

}
