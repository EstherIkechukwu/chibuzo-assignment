package classTask;

public class MyQueue {
    private boolean isEmpty;
    private int size = 0;
    private int number = 0;
    private String[] elements = new String[5];

    public boolean isEmpty() {
        this.isEmpty = true;
        return isEmpty;
    }

    public boolean isNotEmpty() {
        this.isEmpty = true;
        return isEmpty;
    }

    public void add(String element) {
        this.elements[size] = element;
        this.size++;
    }

    public int size() {
        return this.size;
    }

    public void remove(String element) {
        String element1 = this.elements[size - (size - 1)];
        this.size--;
        this.number++;
    }

    public void offer(String element) {
        this.elements[size] = element;
        this.size++;
    }

    public String peek() {
        return this.elements[size - 1];
    }

    public String poll() {
        return this.elements[size - 1];
    }

}
