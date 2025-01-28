package classTask;

public class MySet {
    MyArrayList myList = new MyArrayList();
    private boolean isEmpty;
    private String[] elements = new String[5];


    public boolean isEmpty() {
        isEmpty = true;
        return isEmpty;
    }

    public boolean isNotEmpty() {
        isEmpty = true;
        return isEmpty;
    }

    public void add(String element) {
        if(!myList.contains(element)) {
            myList.add(element);
        }
    }

    public int size() {
        return myList.size();
    }

    public String get(int index) {
        return myList.get(index);
    }

    public void remove(String element) {
        myList.remove(element);
    }

    public int capacity() {
        return myList.capacity();
    }

    public void clear() {
        myList.clear();
    }

    public boolean contains(String element) {
        return myList.contains(element);
    }
}
