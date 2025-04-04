package src.main.java;

public class IntVector implements IntList {
    private int[] array;
    private int size;

    public IntVector() {
        array = new int[20];
        size = 0;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            int[] newArray = new int[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            newArray[size] = number;
            setArray(newArray);
        } else {
            array[size] = number;
        }
        size++;
    }

    @Override
    public int get(int id) {
        System.out.println("Wrong ID");
        return -1;
    }
}
