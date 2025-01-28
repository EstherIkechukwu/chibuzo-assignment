package classTask.TestCases;

import classTask.MyArrayList;
import classTask.MySet;

public class MyMap {
    private boolean isEmpty;
    private int size;
    MySet mySet = new MySet();
    MyArrayList myList = new MyArrayList();

    public boolean isEmpty() {
        this.isEmpty = true;
        return isEmpty;
    }

    public void put(String key, String value) {
        mySet.add(key);
        myList.add(value);
        this.size++;
    }

    public boolean isNotEmpty() {
        this.isEmpty = true;
        return isEmpty;
    }

    public int size() {
        return mySet.size();
    }

    public boolean contains(String element) {
        return mySet.contains(element);
    }

    public String get() {
        return myList.get(1);
    }

    public boolean containsKeyAndValue(String key, String value) {
        return mySet.contains(key) && value.equals(myList.get(0));
    }

    public void remove(String element) {
        mySet.remove(element);
    }
}
