package classTask.TestCases;

public class MyStack {
    private boolean isEmpty;
    private int size;
    private String element;
    private String[] elements = new String[6];

    public boolean isEmpty() {
        this.isEmpty = true;
        return isEmpty;
    }

    public void push(String element) {
        for (int i = elements.length - 1; i >= 0 ; i--) {
            elements[i] = element;
        }
        size++;
    }

    public boolean isNotEmpty() {
        this.isEmpty = true;
        return isEmpty;
    }

    public int size() {
        return this.size;
    }

    public String get(int index) {
        return elements[index];
    }

    public void pop() {
        String element = elements[--size];
        elements[size] = null;
    }

    public boolean search(String element) {
        for (int index = 0; index < size; index++) {
            if (elements[index].equals(element)) return true;
        }
        return false;
    }

    public boolean contains(String element) {
        for(String item : elements) {
            if(element.equals(item)) return true;
        }
        return false;
    }

    public String peek() {
        for(int index = 0; index < size-1; index++) {
            return elements[0];
        }
        return null;
    }
}
