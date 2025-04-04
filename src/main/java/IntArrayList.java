package src.main.java;

public class IntArrayList implements IntList {
    public int[] array;
    public int size;

    public IntArrayList() {
        this.array = new int[10];
        this.size = 0;
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
            int[] newArr = new int[(int) (array.length * 1.5)];
            System.arraycopy(array, 0, newArr, 0, array.length);
            newArr[size] = number;
            setArray(newArr);
        } else {
            array[size] = number;
        }
        size++;
    }

    @Override
    public int get(int id) {
        if (id >= 0 && id < size) {
            return array[id];
        } else {
            System.out.println("Wrong ID");
            return -1;
        }
    }
}
