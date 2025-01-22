package classTask;

public class MyArrayList{
    private boolean isEmpty;
    private String element;
    private int size = 0;
    private String[] elements = new String[5];

    public boolean listIsEmpty() {
        return (size == 0);
    }

    public boolean listIsNotEmpty() {
        return (size != 0);
    }

    public void add(String name) {
        this.element = name;
        size++;
    }

    public String get(int element) {

    }
}