package classTask;

public class MyArrayList{
    private boolean isEmpty;
    private int size = 0;
    private String[] elements = new String[5];

    public boolean listIsEmpty() {
        return (size == 0);
    }

    public boolean listIsNotEmpty() {
        return (size != 0);
    }

    public void add(String element) {
        if(size == elements.length) {
            String[] newElements = new String[elements.length * 2];
            for(int index = 0; index < size; index++) {
                newElements[index] = elements[index];
            }
            elements = newElements;
        }
        this.elements[size] = element;
        size++;
    }

    public String get(int index) {
        return elements[index];
    }

    public int size() {
        return size;
    }

    public void remove(String element) {
        int index = findElementIndex(element);
        for(int i = index; i < size -1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
    }

    public int findElementIndex(String element) {
        int elementIndex = -1;
        for(int i = 0; i < elements.length; i++){
            if(elements[i].equals(element)) elementIndex = i;
        }
        return elementIndex;
    }

    public int capacity() {
        return elements.length;
    }

    public boolean contains(String element) {
        for(String item : elements) {
            if(element.equals(item)) return true;
        }
        return false;
    }

    public boolean indexOf(String element) {
        for(int i = 0; i < elements.length; i++) {
            if(element.equals(elements[i])) return true;
        }
        return false;
    }

    public int getElementByIndex(String element) {
        int index = 0;
        for (String item : elements){
            if (item.equals(element)) return index;
            index++;
        }
        return -1;
    }

    public void addAtIndex(String element, int index) {
        for (int i = size()-1; i >= index ; i--) {
            elements[i + 1] = elements[i];
        }
            elements[index] = element;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
            size = 0;
        }
    }


}